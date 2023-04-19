package org.example;

public class PermutationInString {
    /**
     * Time complexity O(m*n)
     * Space complexity O(n)
     */

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {// m - n  -> ( m - n ) * n =  m * n
            if (isAnagram(s1, s2, i)) {
                return true;
            }
        }
        return false;
    }

    boolean isAnagram(String s1, String s2, int left) { // n
        int[] hash = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i)]++;
        }
        for (int i = left; i < left + s1.length(); i++) {
            int count = --hash[s2.charAt(i)];
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
