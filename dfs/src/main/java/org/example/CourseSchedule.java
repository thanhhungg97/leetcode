package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int[] item : prerequisites) {
            int wanted = item[0];
            int mustTake = item[1];
            if (!map.containsKey(wanted)) {
                map.put(wanted, new ArrayList<>());
            }
            map.get(wanted).add(mustTake);

        }
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(visited, i, map)) {
                return false;
            }
        }
        return true;
    }

    boolean dfs(Set<Integer> visited, Integer node, Map<Integer, List<Integer>> map) {
        if (visited.contains(node)) {
            return false;
        }
        if (map.get(node) == null) {
            return true;
        }

        visited.add(node);

        List<Integer> integers = map.get(node);
        for (Integer integer : integers) {
            if (!dfs(visited, integer, map)) {
                return false;
            }
        }
        visited.remove(node);
        integers.clear();
        return true;
    }
}
