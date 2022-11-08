package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {
    List<Integer> towSum(List<Integer> list) {
        twoSumWithTarget(list);
        return list;
    }

    void twoSumWithTarget(List<Integer> list) {
        int maxIndex = findMaxIndex(list);
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (i != maxIndex) {
                set.add(list.get(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (i != maxIndex) {
                int currentValue = list.get(i);
                int targetValue = list.get(maxIndex) - currentValue;
                if (set.contains(targetValue)) {
                    list.remove(maxIndex);
                    list.add(maxIndex, currentValue);
                    list.add(maxIndex, targetValue);
                    return;
                }
            }
        }

    }

    int findMaxIndex(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
                index = i;
            }
        }
        return index;
    }
}
