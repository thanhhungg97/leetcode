package org.example;

public class TwoSum2 {
    /**
     * Using binary search
     */
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int newTarget = target - numbers[i];
            int searchedIndex = search(numbers, newTarget);
            if (searchedIndex != i && searchedIndex != -1) {
                if (i > searchedIndex) {
                    return new int[]{searchedIndex + 1, i + 1};
                }
                return new int[]{i + 1, searchedIndex + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public int[] twoSumOptimize(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            int tmp = numbers[i] + numbers[j];
            if (tmp == target) {
                return new int[]{i + 1, j + 1};
            } else if (tmp > target) {
                j--;
            } else {
                i++;
            }

        }
        return new int[]{-1, -1};
    }

    private int search(int[] number, int target) {
        int i = 0;
        int j = number.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (number[mid] == target) {
                return mid;
            } else if (number[mid] > target) {
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return -1;
    }

}
