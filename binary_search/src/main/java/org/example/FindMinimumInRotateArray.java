package org.example;

public class FindMinimumInRotateArray {
    public int findMin(int[] nums) {
        return findMid(nums);
    }

    private int findMid(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int leftVal = nums[nums.length - 1];
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= leftVal) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return nums[left];
    }

}
