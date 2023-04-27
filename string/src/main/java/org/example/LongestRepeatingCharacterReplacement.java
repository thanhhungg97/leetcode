package org.example;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int tmp = k;
            int j = i + 1;
            while (j < s.length() && tmp > 0) {
                if (s.charAt(j) != s.charAt(i)) {
                    tmp--;
                }
                j++;
            }
            while (j < s.length() && s.charAt(j) == s.charAt(i)) {
                j++;
            }
            max = Math.max(max, j - i);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            int tmp = k;
            int j = i -  1;
            while (j >= 0 && tmp > 0) {
                if (s.charAt(j) != s.charAt(i)) {
                    tmp--;
                }
                j--;
            }
            while (j >= 0 && s.charAt(j) == s.charAt(i)) {
                j--;
            }
            max = Math.max(max, i - j);
        }
        return max;
    }
}
