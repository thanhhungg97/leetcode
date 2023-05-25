package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] tmp = Arrays.copyOf(nums, nums.length);

        Arrays.sort(tmp);
        int i = 0;

        while (i < nums.length && nums[i] == tmp[i]) {
            i++;
        }
        int j = nums.length - 1;

        while (j >= i && nums[j] == tmp[j]) {
            j--;
        }

        return Math.max(0, j - i + 1);

    }

    public int findUnsortedSubarrayOptimize(int[] nums) {
        Deque<Integer> inCreaseStack = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (inCreaseStack.isEmpty()) {
                inCreaseStack.push(nums[i]);
            } else {
                while (!inCreaseStack.isEmpty() && nums[i] < inCreaseStack.peek()) {
                    inCreaseStack.pop();
                }
                inCreaseStack.push(nums[i]);
            }
        }

        Deque<Integer> decreaseStack = new LinkedList<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (decreaseStack.isEmpty()) {
                decreaseStack.push(nums[i]);
            } else {
                while (!decreaseStack.isEmpty() && nums[i] > decreaseStack.peek()) {
                    decreaseStack.pop();
                }
                decreaseStack.push(nums[i]);

            }
        }
        int i = 0;

        while (i < nums.length && nums[i] == inCreaseStack.pollLast()) {
            i++;
        }

        int j = nums.length - 1;

        while (j >= i && nums[j] == decreaseStack.pollLast()) {
            j--;
        }

        return Math.max(0, j - i + 1);
    }


    long getTripCount(List<List<Integer>> locations, Integer startLocation, Integer endLocation) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < locations.size(); i++) {
            Integer unit = locations.get(i).get(0);
            Integer location = locations.get(i).get(1);
            if (!map.containsKey(unit)) {
                map.put(unit, new LinkedList<>());

            }
            map.get(unit).add(location);
        }

        return map.values().stream().filter(item -> isValid(item, startLocation, endLocation)).count();
    }

    boolean isValid(List<Integer> list, Integer startLocation, Integer endLocation) {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) == startLocation && list.get(i) == endLocation) {
                return true;
            }

        }
        return false;
    }


}

