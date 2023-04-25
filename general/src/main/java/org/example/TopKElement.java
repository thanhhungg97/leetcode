package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKElement {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        Map<Integer, List<Integer>> counterMap = new HashMap<>();
        map.entrySet().forEach(item -> {
            if (!counterMap.containsKey(item.getValue())) {
                counterMap.put(item.getValue(), new LinkedList<>());
            }
            counterMap.get(item.getValue()).add(item.getKey());
        });

        return counterMap.entrySet().stream().sorted((a, b) -> b.getKey().compareTo(a.getKey())).flatMap(item -> item.getValue().stream()).limit(k).mapToInt(Integer::intValue).toArray();

    }

    public int[] topKFrequentOptimize(int[] nums, int k) {


        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int[] result = new int[k];
        List<Map.Entry<Integer, Integer>> entries = map.entrySet().stream().collect(Collectors.toList());

        for (int i = 0; i < entries.size(); i++) {
            int max = i;
            for (int j = i + 1; j < entries.size(); j++) {
                if (entries.get(max).getValue() < entries.get(j).getValue()) {
                    max = j;
                }
            }
            if (k > 0) {
                result[--k] = entries.get(max).getKey();
            } else {
                break;
            }
            if (max != i) {
                Map.Entry<Integer, Integer> integerIntegerEntry = entries.get(i);

                entries.set(i, entries.get(max));

                entries.set(max, integerIntegerEntry);

            }

        }

        return result;

    }
}
