package org.example;

public class Problem_283 {
    public void moveZeroes(int[] nums) {

        int countZero = 0;
        int curIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[curIndex] = nums[i];
                curIndex++;
            } else {
                countZero++;
            }
        }
        for (int i = nums.length - countZero; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
