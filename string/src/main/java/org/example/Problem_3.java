package org.example;

public class Problem_3 {
    public int lengthOfLongestSubstring(String s) {

        int[] hash = new int[128];
        int max = 0;
        int count = 0;
        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            count++;
            hash[s.charAt(i)]++;
            if (hash[s.charAt(i)] == 2) {
                while (j < i && hash[s.charAt(i)] != 1) {
                    count--;
                    hash[s.charAt(j)]--;
                    j++;
                }
            }

            max = Math.max(count, max);
        }

        return max;
    }
}
