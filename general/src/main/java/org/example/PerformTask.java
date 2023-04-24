package org.example;

public class PerformTask {

    public int perform(String s) {
        char[] chars = s.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char aChar = chars[i];
            if (aChar == '^' || aChar == 'v') {
                count++;
            }
            if (aChar == '<') {
                if (i == 0 || (chars[i - 1] == '^' || chars[i - 1] == 'v' || chars[i - 1] == '<')) {
                    count++;
                }
            }
            if (aChar == '>') {
                if (i == s.length() - 1 || (chars[i + 1] == '^' || chars[i + 1] == 'v')) {
                    count++;
                }
            }

        }
        return count;
    }
}
