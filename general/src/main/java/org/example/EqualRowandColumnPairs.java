package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class EqualRowandColumnPairs {
    public int equalPairs(int[][] grid) {
        int length = grid.length;
        int count = 0;
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {
                if (check(row, column, grid)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int equalPairsOptimize(int[][] grid) {
        int length = grid.length;
        int count = 0;

        Map<List<Integer>, Integer> map = new HashMap<>();
        for (int row = 0; row < length; row++) {
            List<Integer> list = new LinkedList<>();
            for (int i : grid[row]) {
                list.add(i);
            }
            if (map.containsKey(list)) {
                Integer integer = map.get(list);

                map.put(list, integer + 1);
            } else {
                map.put(list, 1);
            }
        }

        for (int column = 0; column < length; column++) {
            List<Integer> list = new LinkedList<>();

            for (int j = 0; j < grid.length; j++) {
                list.add(grid[j][column]);
            }
            if( map.containsKey(list)){
                count += map.get(list);
            }

        }
        return count;
    }


    private boolean check(int row, int column, int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            if (grid[row][i] != grid[i][column]) {
                return false;
            }
        }
        return true;
    }

    int[] extractData(int index, int[][] grid, boolean isRow) {
        int[] data = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            if (isRow) {
                data[i] = grid[index][i];

            } else {
                data[i] = grid[i][index];
            }
        }
        return data;
    }


    boolean isEqual(int[] dataRow, int[] dataColumn) {
        for (int i = 0; i < dataColumn.length; i++) {
            if (dataColumn[i] != dataRow[i]) {
                return false;
            }
        }
        return true;
    }

}
