package org.example;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubsequence {
    public int longestPalindromeSubseq(String s) {
        Set<String> generateSubSequence = generateSubsequence(s);
        return generateSubSequence
                .stream()
                .filter(this::checkValidPalindromic)
                .sorted((o1, o2) -> Integer.compare(o2.length(), o1.length()))
                .limit(1)
                .map(String::length)
                .findFirst()
                .orElse(0);
    }

    private boolean checkValidPalindromic(String s) {
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


    private Set<String> generateSubsequence(String s) {
        Set<String> result = new HashSet<>();
        generateSubsequence(s, s.length(), result, "", 0);
        return result;

    }

    public int longestPalindromeSubseqOptimize(String s) {
        int[][] db = new int[s.length()][s.length()];
        generateSubsequence(s, 0, s.length() - 1, db);
        return db[0][s.length() - 1];

    }

    private int generateSubsequence(String s, int i, int j, int[][] db) {
        if (db[i][j] != 0) {
            return db[i][j];
        }
        int result;

        if (i == j) {
            result = 1;
        } else if (i > j) {
            result = 0;
        } else if (s.charAt(i) == s.charAt(j)) {
            result = 2 + generateSubsequence(s, i + 1, j - 1, db);
        } else {
            result = Math.max(generateSubsequence(s, i, j - 1, db), generateSubsequence(s, i + 1, j, db));
        }
        db[i][j] = result;
        return result;
    }

    private void generateSubsequence(String s, int length, Set<String> result, String current, int i) {
        if (i == length) {
            if (!current.isEmpty()) {
                result.add(current);
            }
        } else {
            if (s.length() > 2) {

            }
            generateSubsequence(s, length, result, current, i + 1);
            generateSubsequence(s, length, result, current + s.charAt(i), i + 1);
        }
    }
}
