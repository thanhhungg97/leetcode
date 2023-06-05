package org.example.contest.contest348;

public class MinimizeStringLength {
    public int minimizedStringLength(String s) {
        int[] map = new int[128];
        for (char c : s.toCharArray()) {
            map[c]++;
        }
        int count = 0;
        for (int i = 0; i < 128; i++) {
            if (map[i] != 0) {
                count++;
            }
        }
        return count;
    }

}
