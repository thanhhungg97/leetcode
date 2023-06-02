package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathinBinaryMatrix {
    static class Unit {
        int path;
        int x;
        int y;

        public Unit(int path, int x, int y) {
            this.path = path;
            this.x = x;
            this.y = y;
        }
    }


    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] direction = new int[][]{
                {0, 1},
                {0, -1},
                {1, 0},
                {-1, 0},
                {1, 1},
                {-1, 1},
                {1 , -1},
                {-1, -1}
        };
        Queue<Unit> queue = new LinkedList<>();
        int ans = Integer.MAX_VALUE;
        if (grid[0][0] == 1) {
            return -1;
        }
        queue.add(new Unit(1, 0, 0));
        grid[0][0] = 1;
        while (!queue.isEmpty()) {
            Unit unir = queue.poll();
            if (unir.x == grid.length - 1 && unir.y == grid.length - 1) {
                ans = Math.min(ans, unir.path);
            } else {
                for (int[] ints : direction) {
                    int nextX = unir.x + ints[0];
                    int nextY = unir.y + ints[1];
                    if (nextX >= 0 && nextX < grid.length && nextY >= 0 && nextY < grid.length && grid[nextX][nextY] != 1) {
                        queue.add(new Unit(unir.path + 1, nextX, nextY));
                        grid[nextX][nextY] = 1;
                    }
                }
            }


        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

}
