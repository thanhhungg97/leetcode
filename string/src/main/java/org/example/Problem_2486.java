package org.example;

public class Problem_2486 {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                count += 1;
                i++;
                j++;
            } else {
                i++;
            }
        }
        if (count == t.length()) {
            return 0;
        } else {
            return t.length() - count;
        }
    }

}
