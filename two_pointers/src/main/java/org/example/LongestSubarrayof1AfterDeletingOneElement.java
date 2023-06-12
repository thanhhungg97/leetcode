package org.example;

import javax.xml.stream.events.EndDocument;

public class LongestSubarrayof1AfterDeletingOneElement {
    public int longestSubarray(int[] nums) {
        int k = 1;
        int start = 0;
        int result = 0;
        int count = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 1) {
                count++;
            } else {
                if (nums[end] == 0 && k == 1) {
                    k = 0;
                    continue;
                }
                while (nums[start] != 0) {
                    count--;
                    start++;
                }
                start++;
                k = 1;
            }
            result = Math.max(count, result);

        }
        return result;
    }
}
