package org.example;

import java.util.HashMap;
import java.util.Map;

public class FormatString {

    Integer format(String s) {
        return optimize(s);
    }

    Integer help(String s, Integer count, Map<String, Integer> countMap) {
        if (s.length() < 2) {
            return count;
        }
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == 'A' && s.charAt(i - 1) == 'B') {
                if (countMap.containsKey(s)) {
                    return countMap.get(s);
                }
                String sb = new StringBuilder(s).deleteCharAt(i).toString();
                String sc = new StringBuilder(s).deleteCharAt(i - 1).toString();
                int min = Math.min(help(sb, count + 1, countMap), help(sc, count + 1, countMap));
                countMap.put(s, min);
                return min;
            }
        }
        return count;
    }

    Integer optimize(String s) {
        int[] db = new int[s.length() + 1];
        int countB = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                countB++;
                db[i + 1] = db[i];
            } else {
                db[i + 1] = Math.min(db[i] + 1, countB);
            }
        }
        return db[s.length()];
    }
}
