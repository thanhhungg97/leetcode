package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortedSum {
    private static Integer MODULO = (int) (Math.pow(10, 9) + 7);

    public int sortedSum(List<Integer> a) {
        int result = 0;
        for (int i = 0; i < a.size(); i++) {
            List<Integer> integers = a.subList(0, i + 1).stream().sorted().toList();
            for (int j = 0; j < integers.size(); j++) {
                result += (j + 1) * (long) integers.get(j) % MODULO;
            }
        }
        return result;

    }

    public int sortedSumOptimize(List<Integer> a) {
        a = new ArrayList<>(a);

        long result = a.get(0);
        int i = 1;
        while (i < a.size()) {
            for (int j = i; j > 0; j--) {
                if (a.get(j - 1) > a.get(j)) {
                    swap(a, j - 1, j);
                }
            }

            for (int k = 0; k <= i; k++) {
                long tmp = (long) (k + 1) * a.get(k);
                result += tmp;
            }

            i++;
        }
        return (int) (result % MODULO);
    }

    private void swap(List<Integer> a, int i, int j) {
        Integer tmp = a.get(i);
        a.set(i, a.get(j));
        a.set(j, tmp);
    }
}
