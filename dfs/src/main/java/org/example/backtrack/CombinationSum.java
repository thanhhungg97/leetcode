package org.example.backtrack;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        process(candidates, target, result, 0, new LinkedList<>());
        return result.stream().toList();
    }

    private void process(int[] candidates, int target, Set<List<Integer>> result, int total, List<Integer> curr) {
        if (total > target) {
            return;
        }
        if (total == target) {
            result.add(List.copyOf(curr.stream().sorted().toList()));
            return;
        }
        for (int i = 0; i < candidates.length; i++) {
            curr.add(candidates[i]);
            process(candidates, target, result, total + candidates[i], curr);
            curr.remove(curr.size() - 1);
        }
    }
}
