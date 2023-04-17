package org.example;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[(k + i) % length] = nums[i];
        }
        for (int i = 0; i < length; i++) {
            nums[i] = result[i];
        }
    }
}
