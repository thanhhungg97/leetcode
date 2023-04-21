package org.example;

public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (count >= 2) {
                    return false;
                }
                if (i >= 2 && nums[i] < nums[i - 2]) {
                    nums[i] = nums[i - 1];
                } else {
                    nums[i - 1] = nums[i];
                }
            }
        }
        return true;
    }
}
