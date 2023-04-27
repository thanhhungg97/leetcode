package org.example;

import java.util.ArrayList;
import java.util.List;

public class MinimumDays {
    int getMinimum(int[] D, int X) {

        int count = 0;
        int i = 0;
        while (i < D.length) {
            count += 1;
            List<Integer> tmp = new ArrayList<>();
            tmp.add(D[i]);
            int j = i + 1;
            while (j < D.length) {
                if (canAdd(D[j], tmp, X)) {
                    tmp.add(D[j]);
                    j++;
                } else {
                    break;
                }
            }
            i = j;
        }
        return count;
    }

    int getMinimumOptimize(int[] D, int X) {

        int count = 0;
        int i = 0;
        while (i < D.length) {
            count += 1;
            int min = D[i];
            int max = D[i];
            int j = i + 1;
            while (j < D.length) {
                if (canAdd(D[j], min, max, X)) {
                    min = Math.min(min, D[j]);
                    max = Math.max(max, D[j]);
                    j++;
                } else {
                    break;
                }
            }
            i = j;
        }
        return count;
    }

    private boolean canAdd(int i, Integer min, Integer max, int X) {
        return i - min <= X && max - i <= X;

    }

    private boolean canAdd(int i, List<Integer> tmp, int X) {
        for (Integer integer : tmp) {
            if (Math.abs(i - integer) > X) {
                return false;
            }
        }
        return true;
    }
}
