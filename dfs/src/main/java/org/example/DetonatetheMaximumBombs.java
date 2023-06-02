package org.example;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class DetonatetheMaximumBombs {
    public int maximumDetonation(int[][] bombs) {
        int length = bombs.length;
        List[] graph = new List[bombs.length];
        for (int i = 0; i < length; i++) {
            graph[i] = new LinkedList<>();
        }

        for (int i = 0; i < length; i++) {
            List<Integer> edgeI = graph[i];
            int x0 = bombs[i][0];
            int y0 = bombs[i][1];
            int r = bombs[i][2];
            for (int j = i + 1; j < length; j++) {
                List<Integer> edgeJ = graph[j];

                int x1 = bombs[j][0];
                int y1 = bombs[j][1];
                int r1 = bombs[j][2];
                long distance = (long) (x1 - x0) * (x1 - x0) + (long) (y1 - y0) * (y1 - y0);
                if ((long) r * r >= distance) {
                    edgeI.add(j);
                }
                if ((long) r1 * r1 >= distance) {
                    edgeJ.add(i);
                }

            }
        }
        int result = 0;
        for (int i = 0; i < graph.length; i++) {
            result = Math.max(dfs(graph, i), result);
        }
        return result;
    }

    private int dfs(List[] graph, int i) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(i);
        visited.add(i);
        int count = 1;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            List<Integer> list = graph[poll];
            for (Integer item : list) {
                if (!visited.contains(item)) {
                    count++;
                    queue.add(item);
                    visited.add(item);
                }
            }
        }

        return count;

    }

}
