package org.example;

import java.util.HashMap;
import java.util.Map;

public class HouseRobber {
    public int rob(int[] nums) {
        return rob1(nums);
    }

    int rob1(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }
        int a = nums[0];
        int b = Math.max(nums[1], nums[0]);

        int result = b;
        for (int i = 2; i < nums.length; i++) {
            result = Math.max(a + nums[i], b);
            a = b;
            b = result;

        }
        return result;

    }

    private int rob(int[] nums, int currentIndex, Map<Integer, Integer> memory) {

        if (currentIndex == 0) {
            memory.put(0, nums[0]);
            return nums[0];
        }
        if (currentIndex == 1) {
            memory.put(1, Math.max(nums[0], nums[1]));
            return Math.max(nums[0], nums[1]);
        } else {
            Integer maximum = memory.get(currentIndex);

            if (maximum != null) {
                return maximum;
            }

            Integer notChoosingPreviousHouse = rob(nums, currentIndex - 2, memory) + nums[currentIndex];
            Integer choosingPreviousHouse = rob(nums, currentIndex - 1, memory);
            memory.put(currentIndex, Math.max(notChoosingPreviousHouse,
                    choosingPreviousHouse));
            return Math.max(notChoosingPreviousHouse,
                    choosingPreviousHouse);
        }

    }
}
