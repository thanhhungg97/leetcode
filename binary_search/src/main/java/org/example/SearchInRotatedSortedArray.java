package org.example;

public class SearchInRotatedSortedArray {


    /*
    Note: if left < right -> we need to check two last value
          if left <= right -> we need to check only the last value
    First, we need to find the pivot index
    That pivot split the array to two array sorted,
    And then we use binary search on each array
     */
    public int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        int result = binarySearch(nums, 0, pivot, target);
        if (result == -1) {
            return binarySearch(nums, pivot + 1, nums.length - 1, target);
        } else {
            return result;
        }
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        int l = left;
        int r = right;
        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }


    public static int findPivot(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int r = nums.length - 1;

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= nums[r]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left - 1;
    }
}
