package org.example;
/**
 *  get the mid element and compare with its neighborhood
 *  if the value greater than other -> this is the peak element
 *  if the value is greater that the index + -> we need to go down hill
 *  else -> we need to go up hill

 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        return findPeak(nums);
    }

    private int findPeak(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > getValueAtIndex(nums, mid - 1) && nums[mid] > getValueAtIndex(nums, mid + 1)) {
                return mid;
            } else {
                if( nums[mid] > nums[mid + 1]){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return left;
    }

    private int getValueAtIndex(int[] nums, int index) {
        if (index == -1 || index == nums.length) {
            return Integer.MIN_VALUE;
        }
        return nums[index];
    }
}
