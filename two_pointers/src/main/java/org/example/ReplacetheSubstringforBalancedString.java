package org.example;

public class ReplacetheSubstringforBalancedString {
    public int balancedString(String s) {
        int[] map = new int[128];
        int maxLength = s.length() / 4;
        int start = 0;
        int max = 0;
        int minStart = 0;
        int maxEnd = 0;
        for (int end = 0; end < s.length(); end++) {
            map[s.charAt(end)]++;
            while (map[s.charAt(end)] > maxLength) {
                map[s.charAt(start++)]--;
            }
            if (max < end - start + 1) {
                minStart = start;
                maxEnd = end;
                max = end - start + 1;
            }
        }
        map = new int[128];
        for (int i = minStart; i <= maxEnd; i++) {
            map[s.charAt(i)]++;
        }
        for (int i = s.length() - 1; i > maxEnd; i--) {
            if (map[s.charAt(i)] < maxLength) {
                map[s.charAt(i)]++;
                max++;
            } else {
                break;
            }
            // 4
        }
        return s.length() - max;
    }
}
