package org.example;

import java.util.Arrays;

public class MinimumOperationstoReduceXtoZero {
    public int minOperations(int[] nums, int x) {
        int[][] memo = new int[nums.length][nums.length];
        return helper(nums, x, 0, nums.length - 1, 0, memo);

    }

    private int helper(int[] nums, int x, int i, int j, int ops, int[][] memo) {
        if (x == 0) {
            return ops;
        }
        if (i > j) {
            return -1;
        }
        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        if (x < 0) {
            return -1;
        }


        int try1 = helper(nums, x - nums[i], i + 1, j, ops + 1, memo);
        int try2 = helper(nums, x - nums[j], i, j - 1, ops + 1, memo);
        if (try1 != -1 && try2 != -1) {
            memo[i][j] = Math.min(try1, try2);
        } else {
            if (try1 != -1) {
                memo[i][j] = try1;
            } else {
                memo[i][j] = try2;
            }
        }
        return memo[i][j];
    }

    public int minOperationsOptimize(int[] nums, int x) {
        int i = 0;

        int sum = Arrays.stream(nums).sum();


        int maxLength = -1;
        int total = sum - x;
        for (int j = 0; j < nums.length; j++) {
            total = total - nums[j];
            while (total < 0 && i < nums.length) {
                total += nums[i];
                i++;
            }
            if (total == 0) {
                maxLength = Math.max(maxLength, j - i + 1);
            }


        }

        if (maxLength == -1) {
            return -1;
        }
        return nums.length - maxLength;
    }
}
