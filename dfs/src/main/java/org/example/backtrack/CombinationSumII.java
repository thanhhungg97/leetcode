package org.example.backtrack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new LinkedList<>();
        helper(candidates, result, target, new LinkedList<>());
        return result.stream().toList();
    }

    private void helper(int[] candidates, List<List<Integer>> result, int target, List<Integer> curr) {
        if (target == 0) {
            result.add(List.copyOf(curr));
            return;
        }
        if (target < 0) {
            return;
        }

        int prev = -1;

        for (int j = 0; j < candidates.length; j++) {
            int candidate = candidates[j];
            if (candidate == prev) {// todo
                continue;
            }
            curr.add(candidate);
            helper(candidates, result, target - candidate, curr);
            curr.remove(curr.size() - 1);
            prev = candidate;
        }

    }
}
