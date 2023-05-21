package org.example;

public class LexicographicallySmallestPalindrome {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (chars[i] > chars[j]) {
                chars[i] = chars[j];
            } else if (chars[i] < chars[j]) {
                chars[j] = chars[i];
            }
            i += 1;
            j -= 1;
        }
        return new String(chars);
    }
}
