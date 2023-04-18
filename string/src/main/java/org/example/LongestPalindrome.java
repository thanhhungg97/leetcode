package org.example;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class LongestPalindrome {


    public String longestPalindrome(String s) {
        int count = 0;
        Set<String> palindromeString = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            palindromeString.addAll(expanding(s, i, i + 1));
            palindromeString.addAll(expanding(s, i, i));


        }
        return palindromeString.stream().max(Comparator.comparingInt(String::length)).get();
    }

    Set<String> expanding(String s, int i, int j) {
        Set<String> palindromeString = new HashSet<>();
        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) == s.charAt(j)) {
                palindromeString.add(s.substring(i, j + 1));
                i--;
                j++;
            } else {
                break;
            }
        }
        return palindromeString;

    }
}
