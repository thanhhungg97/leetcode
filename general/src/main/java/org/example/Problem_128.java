package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem_128 {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }
        Set<Integer> tmp = new HashSet<>();

        for (int num : nums) {
            tmp.add(num);
        }

        List<Integer> listInteger = tmp.stream().sorted().toList();


        int maxCount = 1;
        int count = 1;
        for (int i = 1; i < listInteger.size(); i++) {
            if (listInteger.get(i) == listInteger.get(i - 1) + 1) {
                count = count + 1;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 1;

            }
        }
        maxCount = Math.max(maxCount, count);

        return maxCount;

    }

    public int longestConsecutiveBadVersion(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
            hashSet.add(num);
        }

        int maxCount = 0;
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (hashSet.contains(i)) {
                count = count + 1;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }

    private int findNextIndex(int[] nums, int curVal) {
        for (int i = 0; i < nums.length; i++) {

        }
        return 1;
    }
}
