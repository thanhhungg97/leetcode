package org.example;

public class MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int total = 0;
        int minLength = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            total += nums[end];

            while (total >= target) {
                minLength = Math.min(end - start + 1, minLength);
                total -= nums[start];
                start++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }

}
