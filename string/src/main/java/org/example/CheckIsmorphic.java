package org.example;

import java.util.HashMap;
import java.util.Map;

public class CheckIsmorphic {
    public boolean isIsomorphic(String s, String t) {
        return check(s, t) && check(t, s);
    }

    boolean check(String s, String t) {
        Map<Character, Character> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char c1 = t.charAt(i);
            if (hashMap.containsKey(c)) {
                if (hashMap.get(c) != c1) {
                    return false;
                }
            } else {
                hashMap.put(c, c1);
            }

        }
        return true;
    }

}
