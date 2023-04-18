package org.example;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] hashmap = new int[128];
        for (char c : s.toCharArray()) {
            hashmap[c]++;
        }
        for (char c : t.toCharArray()) {
            hashmap[c]--;
        }
        for (int i = 0; i < 128; i++) {
            if (hashmap[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
