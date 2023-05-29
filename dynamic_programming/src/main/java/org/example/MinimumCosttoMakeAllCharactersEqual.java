package org.example;

import java.awt.image.WritableRaster;
import java.util.Arrays;

public class MinimumCosttoMakeAllCharactersEqual {
    public long minimumCost(String s) {
        return helper(s.toCharArray(), 0, s.length() - 1);
    }

    boolean isValid(char[] s) {
        for (int i = 1; i < s.length; i++) {
            if (s[i] != s[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private long helper(char[] s, int left, int right) {
        if (isValid(s)) {
            return 0;
        }
        if (left > right) {
            return Integer.MAX_VALUE;
        }
        int mid = left + (right - left) / 2;

        char[] option1 = modifyAndCopy(s, left, mid);
        char[] option2 = modifyAndCopy(s, mid + 1, right);

        return Math.min(helper(option1, left, mid + 1) + mid, helper(option2, mid + 1, right) + right - mid);


    }

    char[] modifyAndCopy(char[] s, int left, int right) {
        char[] chars = Arrays.copyOf(s, s.length);

        for (int i = left; i <= right; i++) {
            if (chars[i] == '0') {
                chars[i] = '1';
            } else {
                chars[i] = '0';
            }
        }
        return chars;


    }

}
