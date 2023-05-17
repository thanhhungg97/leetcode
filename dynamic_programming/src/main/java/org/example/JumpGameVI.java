package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class JumpGameVI {
    public int maxResult(int[] nums, int k) {
        int[] mem = new int[nums.length];
        Arrays.fill(mem, Integer.MIN_VALUE);
        return helper(0, nums, k, mem);

    }

    private int helper(int i, int[] nums, int k, int[] mem) {
        if (i == nums.length - 1) {
            return nums[i];
        }
        if (mem[i] != Integer.MIN_VALUE) {
            return mem[i];
        }
        int max = Integer.MIN_VALUE;
        for (int start = i + 1; start <= Math.min(i + k, nums.length - 1); start++) {
            int helper = helper(start, nums, k, mem);
            max = Math.max(max, helper);
        }

        mem[i] = max + nums[i];
        return mem[i];

    }

    public int maxResultOptimize(int[] nums, int k) {
        int[] mem = new int[nums.length];
        SortedMap<Integer, Integer> treeMap = new TreeMap(Comparator.reverseOrder());

        Arrays.fill(mem, Integer.MIN_VALUE);
        mem[0] = nums[0];
        treeMap.put(mem[0], 1);

        int start = 0;
        for (int end = 1; end < nums.length; end++) {
            while (end - start > k) {
                Integer integer = treeMap.getOrDefault(mem[start], 0);
                if (integer == 1) {
                    treeMap.remove(mem[start]);
                }
                if (integer == 2) {
                    treeMap.put(mem[start], 1);
                }
                start++;
            }
            mem[end] = treeMap.firstKey() + nums[end];
            Integer integer = treeMap.getOrDefault(mem[end], 0);
            treeMap.put(mem[end], integer + 1);

        }
        return mem[nums.length - 1];

    }

}
