package org.example;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class FindUniqueBinaryString {
    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(

        );
        for (String num : nums) {
            set.add(num);
        }
        return dfs(set, 0, nums[0].length(), "");
    }


    public String findDifferentBinaryOptimize(String[] nums) {
        char[] result = new char[nums[0].length()];

        for (int i = 0; i < result.length; i++) {
            if (i >= nums.length || nums[i].charAt(i) == '1') {
                result[i] = '0';
            }
            else{
                result[i] = '1';

            }

        }
        return new String(result);
    }

    private String dfs(Set<String> nums, int i, int length, String s) {
        if (i == length) {
            if (!nums.contains(s)) {
                return s;
            }
            return "";
        } else {
            String dfs = dfs(nums, i + 1, length, s + "0");
            if (!dfs.equals("")) {
                return dfs;
            }
            String dfs1 = dfs(nums, i + 1, length, s + "1");
            if (!Objects.equals(dfs1, "")) {
                return dfs1;
            }

        }
        return "";
    }
}
