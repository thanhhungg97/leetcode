package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//todo
public class HotelConstruction {


    public static int numberOfWays(List<List<Integer>> roads) {
        int cities = roads.size() + 1;

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        roads.forEach(item -> {
            map.put(item.get(0), item.get(1));
            map1.put(item.get(1), item.get(0));

        });
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 1; i <= cities; i++) {
            if (map.containsKey(i)) {
                picking(map, map.get(i), i, cities, result);
            }
        }


        return result.size();

    }

    private static void picking(Map<Integer, Integer> map, int distance, int i, int cities, Set<List<Integer>> result) {
        for (int j = 1; j <= cities; j++) {
            for (int k = 1; k < cities; k++) {
                if (map.containsKey(k) && map.containsKey(j) && map.get(k) == distance && map.get(j) == distance) {
                    List<Integer> integers = Arrays.stream(new Integer[]{i, j, k}).sorted().collect(Collectors.toList());
                    result.add(integers);
                }
            }

        }
    }
}
