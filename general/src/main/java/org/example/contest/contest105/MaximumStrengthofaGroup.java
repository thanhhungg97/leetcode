package org.example.contest.contest105;

import java.util.LinkedList;
import java.util.List;

public class MaximumStrengthofaGroup {
    public long maxStrength(int[] nums) {

        List<Long> list = new LinkedList<>();
        helper(nums, 0, list, new LinkedList<>());
        return list.stream().max(Long::compare).orElse(0L);
    }

    private void helper(int[] nums, int i, List<Long> list, List<Long> cur) {
        if (i == nums.length) {
            if (!cur.isEmpty()) {
                Long reduce = cur.stream().reduce(1L, (a, b) -> a * b);
                list.add(reduce);

            }
        } else {
            cur.add(Long.valueOf(nums[i]));
            helper(nums, i + 1, list, cur);
            cur.remove(cur.size() - 1);
            helper(nums, i + 1, list, cur);
        }
    }
}
