package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1
                );
            } else {
                map.put(aChar, 1);
            }
        }


        List<Map.Entry<Character, Integer>> collect = map.entrySet().stream().sorted((o1, o2) -> o2.getValue().compareTo(o1.getValue())).collect(Collectors.toList());
        char[] result = new char[s.length()];
        int j = 0;
        int k = 0;

        Integer remain = 0;
        Character currentChar = null;
        while (k < collect.size() && j < s.length()) {
            Map.Entry<Character, Integer> characterIntegerEntry = collect.get(k);
            remain = characterIntegerEntry.getValue();
            currentChar = characterIntegerEntry.getKey();
            while (j < s.length() && remain > 0) {
                result[j] = currentChar;
                j += 2;
                remain--;
            }
            k++;
        }
        j = 1;

        while (remain > 0 && j < s.length()) {
            result[j] = currentChar;
            remain--;
            j += 2;
        }
        while (k < collect.size() && j < s.length()) {
            Map.Entry<Character, Integer> characterIntegerEntry = collect.get(k);
            remain = characterIntegerEntry.getValue();
            Character key = characterIntegerEntry.getKey();
            while (remain > 0) {
                result[j] = key;
                j += 2;
                remain--;
            }
            k++;
        }
        if (j >= s.length()) {
            String tmp = new String(result);
            for (int i = 1; i < s.length(); i += 2) {
                if (tmp.charAt(i - 1) == tmp.charAt(i)) {
                    return "";
                }
            }
            return tmp;
        } else {
            return "";
        }

    }

    public String reorganizeStringOptimize(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (map.containsKey(aChar)) {
                map.put(aChar, map.get(aChar) + 1);
            } else {
                map.put(aChar, 1);
            }
        }

        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        map.entrySet().forEach(priorityQueue::add);
        StringBuilder result = new StringBuilder();
        while (priorityQueue.size() > 1) {
            Map.Entry<Character, Integer> poll = priorityQueue.poll();

            Integer value = poll.getValue();

            if (result.isEmpty() || result.charAt(result.length() - 1) != poll.getKey()) {
                result.append(poll.getKey());
                if (value > 1) {
                    poll.setValue(value - 1);
                    priorityQueue.add(poll);
                }
            } else {
                Map.Entry<Character, Integer> poll1 = priorityQueue.poll();
                result.append(poll1.getKey());
                if (poll1.getValue() > 1) {
                    poll1.setValue(poll1.getValue() - 1);
                    priorityQueue.add(poll1);
                }
                priorityQueue.add(poll);
            }
        }
        Map.Entry<Character, Integer> poll = priorityQueue.poll();
        if( poll.getValue() > 1){
            return "";
        }
        result.append(poll.getKey());
        return result.toString();
    }
}
