package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

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

}
