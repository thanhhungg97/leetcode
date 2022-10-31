package org.example;
/**
 *
 */
public class FightFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target, true);
        if (first == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{first, findFirst(nums, target, false)};
    }

    private int findFirst(int[] nums, int target,boolean leftBias) {
        int left = 0;
        int right = nums.length - 1;
        int temp = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                temp = mid;
                if(leftBias){
                    right = mid - 1;

                }else{
                    left = mid + 1;
                }
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }
        return temp;
    }


}

