package org.example;

public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int product = 1;
        int count = 0;
        while (right < nums.length) {
            product = product * nums[right];
            if (product >= k) {
                while (product >= k && left < nums.length) {
                    product = product / nums[left++];
                }
            }
            count += right - left + 1;
            right += 1;
        }
        return count;
    }
}
