package org.example;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] db = new int[nums.length];
        int ans = Integer.MIN_VALUE;
        db[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            db[i] = Math.max(db[i - 1] + nums[i], nums[i]);
            ans = Math.max(ans, db[i]);
        }
        return ans;
    }



}
