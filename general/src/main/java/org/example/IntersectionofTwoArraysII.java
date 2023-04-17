package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 *  The second first logarithm will be better.
 *
 */
public class IntersectionofTwoArraysII {

    /**
     * Time complexity: O(N + M)
     * Space complexity: O(N)
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums1) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                Integer integer = map.get(i);
                map.put(i, integer + 1);
            }
        }
        List<Integer> result = new LinkedList<>();
        for (int i : nums2) {
            if (map.containsKey(i) && map.get(i) > 0) {
                Integer integer = map.get(i);
                map.put(i, integer - 1);
                result.add(i);
            }

        }
        int size = result.size();
        int[] tmpResult = new int[size];
        for (int i = 0; i < result.size(); i++) {
            tmpResult[i] = result.get(i);
        }

        return tmpResult;
    }

    /**
     * What if the given array is already sorted? How would you optimize your algorithm?
     */

    /**
     * Time complexity: O(N + M)
     * Space complexity: O(1)
     */
    public int[] intersectForSortedArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        List<Integer> result = new LinkedList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            }

        }

        int size = result.size();
        int[] tmpResult = new int[size];
        for (int k = 0; k < result.size(); k++) {
            tmpResult[k] = result.get(k);
        }

        return tmpResult;
    }

}
