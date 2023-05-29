package org.example;

import java.util.Arrays;

public class RemoveTrailingZerosFromaString {
    public String removeTrailingZeros(String num) {
        char[] chars = num.toCharArray();
        int i = chars.length - 1;
        while (i >= 0 && chars[i] == '0') {
            i--;
        }

        return new String(Arrays.copyOf(chars, i + 1));
    }
}
