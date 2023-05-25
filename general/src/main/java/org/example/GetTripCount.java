package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GetTripCount {

    Map<Integer, List<Integer>> map = new HashMap<>();
    Map<List<Integer>, Long> cache = new HashMap<>();
    Set<Integer> setLocation = new HashSet<>();

    GetTripCount(List<List<Integer>> locations) {
        init(locations);
        for (Integer start = 0; start < setLocation.size(); start++) {
            for (Integer end = 0; end < setLocation.size(); end++) {
                cache.put(List.of(start, end), getCount(map, start, end));
            }
        }

    }

    private long getCount(Map<Integer, List<Integer>> list, Integer start, Integer end) {
        long countStart = list.values().stream().filter(item -> isValid(item, start, end)).count();
        return countStart;
    }

    private void init(List<List<Integer>> locations) {
        for (int i = 0; i < locations.size(); i++) {
            Integer unit = locations.get(i).get(0);
            Integer location = locations.get(i).get(1);
            setLocation.add(location);
            if (!map.containsKey(unit)) {
                map.put(unit, new LinkedList<>());
            }
            map.get(unit).add(location);
        }

    }


    long getTripCount(Integer startLocation, Integer endLocation) {

        return cache.get(List.of(startLocation, endLocation));


    }

    private boolean isValid(List<Integer> list, Integer startLocation, Integer endLocation) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == startLocation && list.get(i) == endLocation) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        GetTripCount main = new GetTripCount(List.of(List.of(1, 1), List.of(1, 2)));
        long test = main.getTripCount(1, 2);

        System.out.println(test);


    }
}
