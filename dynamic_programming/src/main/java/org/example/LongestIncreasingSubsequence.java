package org.example;

import java.util.List;

public class LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        return lengthOfLISOptimize(nums, 0, Integer.MIN_VALUE);
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

    private int helper(int[] nums, int length, int i, List<Integer> linkedList, int maxSofar) {
        if (i == length) {
            return Math.max(maxSofar, linkedList.size());
        } else {
            if (linkedList.isEmpty() || nums[i] > linkedList.get(linkedList.size() - 1)) {
                linkedList.add(nums[i]);
                int addX = helper(nums, length, i + 1, linkedList, maxSofar);
                linkedList.remove((Object) nums[i]);
                int notAddX = helper(nums, length, i + 1, linkedList, maxSofar);
                return Math.max(addX, notAddX);
            } else {
                return helper(nums, length, i + 1, linkedList, maxSofar);

            }
        }
    }

}
