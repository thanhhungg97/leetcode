package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class TimeNeededtoInformAllEmployees {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < manager.length; i++) {
            if (manager[i] != -1) {
                if (!map.containsKey(manager[i])) {
                    map.put(manager[i], new LinkedList<>());
                }
                map.get(manager[i]).add(i);
            }
        }
        return bfs(map, informTime ,headID);
    }

    private int bfs(Map<Integer, List<Integer>> map, int[] informTime, int headID) {
        if( !map.containsKey(headID)){
            return 0;
        }
        else{
            List<Integer> list = map.get(headID);

            int max = Integer.MIN_VALUE;
            for (Integer integer : list) {
                max = Math.max(bfs(map, informTime, integer), max);
            }
            return max + informTime[headID];
        }

    }
}
