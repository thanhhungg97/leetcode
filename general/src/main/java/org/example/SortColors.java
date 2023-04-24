package org.example;

import java.util.HashMap;
import java.util.Map;

public class SortColors {
    public void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                Integer integer = map.get(nums[i]);

                map.put(nums[i], integer + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int j = 0;
        for (int i = 0; i < 3; i++) {
            Integer integer = map.get(i);
            if (integer != null) {
                while (integer > 0) {
                    nums[j++] = i;
                    integer--;
                }
            }

        }
    }


}