package org.example;

import java.util.List;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        return lengthOfLISOptimize(nums, nums.length, 1);
    }


    public int lengthOfLISOptimize(int[] nums, int i, int last) {
        if (i >= nums.length) {
            return 0;
        }
        int result;
        if (nums[i] > last) {
            int take = 1 + lengthOfLISOptimize(nums, i + 1, nums[i]);
            int dontTake = lengthOfLISOptimize(nums, i + 1, last);
            result = Math.max(take, dontTake);
        } else {
            result = lengthOfLISOptimize(nums, i + 1, last);
        }
        return result;
    }




}
