package org.example;

import java.util.Arrays;

public class JumpGameII {
    public int jump(int[] nums) {
        int[] mem = new int[nums.length];
        return helper(0, nums, mem);
    }

    public int jumpOptimize(int[] nums) {
        int[] db = new int[nums.length];
        Arrays.fill(db, 1000000);
        db[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            int min = 1000000;

            for (int j = 0; j < i; j++) {
                if (nums[j] >= i - j) {
                    min = Math.min(min, db[j]);
                }
            }
            db[i] = min + 1;
        }
        return db[nums.length - 1];
    }

    private int helper(int i, int[] nums, int[] mem) {


        if (i == nums.length - 1) {
            return 0;
        }
        if (nums[i] == 0) {
            return 1000000;
        }
        if (mem[i] != 0) {
            return mem[i];
        }
        int minJump = 1000000;
        for (int j = 1; j <= nums[i]; j++) {
            int jump = Math.min(nums.length - 1, j + i);
            minJump = Math.min(minJump, helper(jump, nums, mem) + 1);
        }
        mem[i] = minJump;
        return mem[i];

    }
}
