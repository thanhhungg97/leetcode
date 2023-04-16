package org.example;

/**
 * Find pivot number, the index that the left side and right side is equal
 */
public class Problem_724 {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        int sumLeft = 0;
        int sumRight;
        for (int i = 0; i < nums.length; i++) {
            sumRight = total - nums[i] - sumLeft;
            if (sumRight == sumLeft) {
                return i;
            }
            sumLeft = sumLeft + nums[i];

        }
        return -1;
    }

}
