package org.example.contest.contest348;

import java.util.Arrays;

public class SumofMatrixAfterQueries {
    public long matrixSumQueries(int n, int[][] queries) {
        int[][] array = new int[n][n];
        for (int[] query : queries) {
            int type = query[0];
            int index = query[1];
            int value = query[2];
            if (type == 0) {
                for (int i = 0; i < n; i++) {
                    array[index][i] = value;
                }
            } else {
                for (int i = 0; i < n; i++) {
                    array[i][index] = value;
                }
            }
        }

        long total = 0;
        for (int[] item : array) {
            total += Arrays.stream(item).sum();
        }
        return total;
    }
}
