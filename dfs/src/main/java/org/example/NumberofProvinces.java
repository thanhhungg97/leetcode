package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberofProvinces {
    public int findCircleNum(int[][] isConnected) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        for (int i = 0; i < isConnected.length; i++) {
            map.put(i, new HashSet<>());
            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[i][j] == 1) {
                    map.get(i).add(j);
                }
            }
        }
        Set<Integer> visited = new HashSet<>();
        int count = 0;
        for (Integer vertex : map.keySet()) {
            if (!visited.contains(vertex)) {
                count++;
                dfs(vertex, map, visited);
            }
        }
        return count;
    }

    void dfs(int i, Map<Integer, Set<Integer>> map, Set<Integer> visit) {
        if (visit.contains(i)) {
            return;
        }
        visit.add(i);
        for (Integer vertex : map.get(i)) {
            dfs(vertex, map, visit);

        }

    }
}
