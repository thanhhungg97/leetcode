package org.example;

import java.util.LinkedList;
import java.util.List;

public class Problem_46 {

    /**
     * 1 2 3
     * 1 -> 2, 3 -> 3, 2
     * 2 -> 1, 3 -> 3, 1
     *
     * @param nums
     * @return
     */
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            List<Integer> curResult = new LinkedList<>();
            curResult.add(nums[i]);
            dfs(result, curResult, i, nums);
        }
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> currList, int index, int[] nums) {
        if (currList.size() == nums.length) {
            result.add(currList);
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (index != i) {
                    currList.add(nums[i]);
                    dfs(result, currList, index, nums);
                }
            }
        }


    }
}
