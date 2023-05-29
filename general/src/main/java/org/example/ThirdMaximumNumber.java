package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return findWithNonDuplicatedArray(set.stream().mapToInt(item -> item).toArray());
    }

    private int findWithNonDuplicatedArray(int[] nums) {
        if (nums.length < 3) {
            return Arrays.stream(nums).max().getAsInt();
        }

        for (int i = 0; i < 3; i++) {
            int max = nums[i];
            int index = i;
            for (int j = i; j < nums.length; j++) {
                if (max < nums[j]) {
                    index = j;
                    max = nums[j];
                }
            }
            if (i != index) {
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index] = tmp;

            }
        }
        return nums[2];
    }

}
