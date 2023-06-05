package org.example.contest.contest348;

public class SemiOrderedPermutation {
    public int semiOrderedPermutation(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int minIndex = 1;
        int maxIndex = 1;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
            if (min > nums[i]) {
                min = nums[i];
                minIndex = i;
            }
        }

        if( minIndex > maxIndex){
           return nums.length - 1 - maxIndex + minIndex - 1;
        }


        return (nums.length - 1 - maxIndex + minIndex);
    }

    void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
