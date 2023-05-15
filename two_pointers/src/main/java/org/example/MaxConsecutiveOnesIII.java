package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        List<int[]> result = new LinkedList<>();
        long numSezo = Arrays.stream(nums).filter(item -> item == 0).count();

        generateList(result, nums, Math.min((int) numSezo, k), new HashSet<>());

        return result.stream().map(this::longest).max(Comparator.naturalOrder()).get();
    }


    private void generateList(List<int[]> result, int[] nums, int k, Set<Integer> chosen) {
        if (k == 0) {
            result.add(Arrays.copyOf(nums, nums.length));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (!chosen.contains(i) && nums[i] == 0) {
                    nums[i] = 1;
                    chosen.add(i);
                    generateList(result, nums, k - 1, chosen);
                    chosen.remove(i);
                    nums[i] = 0;
                }
            }
        }

    }

    private int longest(int[] nums) {

        int result = 0;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                continue;
            }
            int start = end;
            while (end < nums.length && nums[end] == 1) {
                end++;
            }
            result = Math.max(result, end - start);

        }
        return result;
    }

    public int longestOnesOptimize(int[] nums, int k) {
        int start = 0;
        int zeroCount = 0;
        int max = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0){
                zeroCount ++;
            }
            while( zeroCount > k){
                if( nums[start] == 0 ){
                    zeroCount --;
                }
                start ++;
            }
            max = Math.max(max, end -start + 1);

        }
        return max;
    }
}
