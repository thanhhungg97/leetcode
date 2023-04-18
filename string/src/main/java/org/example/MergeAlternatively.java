package org.example;

public class MergeAlternatively {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i++));

            }
            if (j < word2.length()) {
                result.append(word2.charAt(j++));

            }

        }
        return result.toString();
    }
}
