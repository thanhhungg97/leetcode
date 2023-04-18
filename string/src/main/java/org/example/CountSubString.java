package org.example;

/**
 * Palindromic Substrings counting
 */
public class CountSubString {
    public int countSubstrings(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isValidPalindromic(s.substring(i, j + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

    public int countSubstringsOptimize(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += expanding(s, i, i + 1) + expanding(s, i, i);

        }
        return count;
    }

    int expanding(String s, int i, int j) {
        int count = 0;
        while (i >= 0 && j < s.length() ) {
            if (s.charAt(i) == s.charAt(j)) {
                count++;
                i--;
                j++;
            } else {
                break;
            }
        }
        return count;
    }

    boolean isValidPalindromic(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        String substring = "abc".substring(0, 1);

        System.out.println(substring);
    }
}
