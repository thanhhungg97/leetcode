package org.example.backtrack;

import java.util.LinkedList;
import java.util.List;

public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new LinkedList<>();
        helper(0, 0, k, n, new LinkedList<>(), result);
        return result;
    }

    private void helper(int total, int start, int k, int n, List<Integer> curr, List<List<Integer>> result) {
        if (k == 0) {
            if (total == n) {
                result.add(List.copyOf(curr));
            }
        } else {
            for (int i = start + 1; i <= 9; i++) {
                curr.add(i);
                helper(total + i, i, k - 1, n, curr, result);
                curr.remove(curr.size() - 1);

            }
        }
    }
}
