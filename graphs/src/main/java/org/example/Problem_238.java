package org.example;

public class Problem_238 {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = 1;
        int curPrefix = 1;
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i - 1] * curPrefix;
            curPrefix = prefix[i];
        }
        suffix[nums.length - 1] = 1;
        int curSuffix = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = nums[i + 1] * curSuffix;
            curSuffix = suffix[i];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}
