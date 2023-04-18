package org.example;

public class Problem_977 {

    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];
        while (i <= j) {
            if (Math.pow(nums[i], 2) < Math.pow(nums[j], 2)) {
                result[k] = nums[j] * nums[j];
                j--;
            } else {
                result[k] = nums[i] * nums[i];
                i++;
            }
            k--;
        }
        return result;
    }


}
