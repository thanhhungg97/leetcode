package org.example;

import java.util.HashMap;
import java.util.Map;

public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int start = 0;
        int cur = 0;
        int result = 0;
        for (int end = 0; end < nums.length; end++) {
            cur += nums[end];
            if (map.containsKey(nums[end])) {
                Integer integer = map.get(nums[end]);
                map.put(nums[end], integer + 1);
            } else {
                map.put(nums[end], 1);
            }
            while (map.get(nums[end]) > 1) {
                Integer integer = map.get(nums[start]);
                map.put(nums[start], integer - 1);
                cur -= nums[start];
                start++;
            }

            result = Math.max(cur, result);
        }
        return result;
    }
}
