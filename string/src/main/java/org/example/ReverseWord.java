package org.example;

public class ReverseWord {
    public void reverseWord(char[] s, int left, int right) {
        int i = left;
        int j = right;
        while (i < j) {
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    }

    public String reverseWords(String s) {
        char[] chars = s.toCharArray();

        int i = 0;
        int j = 0;
        while (j < s.length()) {
            if (s.charAt(j) == ' ') {
                reverseWord(chars, i, j - 1);
                j++;
                i = j;
            } else {
                j++;
            }
        }
        reverseWord(chars, i, j - 1);
        return new String(chars);
    }
}
