package org.example;

import java.util.LinkedList;
import java.util.List;

public class MaximumSubsequenceScore {
    static int count = 0;

    public long maxScore(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> indexResult = new LinkedList<>();
        generateList(nums1.length, k, 0, indexResult, new LinkedList<>());
        Integer max = indexResult.stream().map(item -> getResult(item, nums1, nums2)).max(Integer::compareTo).get();
        System.out.println(count);
        return Long.valueOf(max);
    }

    int getResult(List<Integer> indexList, int[] num1, int[] nums2) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for (Integer index : indexList) {
            result += num1[index];
            min = Math.min(min, nums2[index]);
        }
        return result * min;

    }

    private void generateList(int length, int k, int index, List<List<Integer>> indexResult, List<Integer> cur) {

        if (index > length) {
            return;
        }
        if (cur.size() == k) {
            indexResult.add(List.copyOf(cur));
            return;
        }
        count++;

        List<Integer> list = new LinkedList<>(cur);
        list.add(index);
        generateList(length, k, index + 1, indexResult, list);
        generateList(length, k, index + 1, indexResult, cur);

    }
}
