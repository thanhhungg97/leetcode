package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {

        List<String> result = new LinkedList<>();
        for (int end = 0; end < nums.length; end++) {
            int start = end;

            while (end < nums.length - 1 && nums[end] +1  == nums[end + 1] ) {
                end++;
            }
            // end = 4
            // start = 2
            // 0, 1, 2, 4, 5, 7

            if (start != end) {
                result.add(nums[start] + "->" + nums[(end)]);
            } else {
                result.add(String.valueOf(nums[end]));
            }
        }


        return result;
    }

}
