package org.example;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class LongestNiceSubstring {
    public String longestNiceSubstring(String s) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.length(), o1.length()));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isNiceString(s, i, j)) {
                    priorityQueue.add(s.substring(i, j + 1));
                }
            }
        }
        if (priorityQueue.isEmpty()) {
            return "";
        } else {
            return priorityQueue.poll();
        }
    }

    public String longestNiceSubstringOptional(String s) {
        Integer maxLength = Integer.MIN_VALUE;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isNiceString(s, i, j) && (maxLength < j - i + 1)) {
                    maxLength = j + 1 - i;
                    result = s.substring(i, j + 1);
                }
            }
        }
        return result;
    }

    public String longestNiceSubstringOptional2(String s) {
        if (s.length() < 2) {
            return "";
        }
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }
            String s1 = longestNiceSubstringOptional2(s.substring(0, i));
            String s2 = longestNiceSubstringOptional2(s.substring(i + 1));
            return s1.length() >= s2.length() ? s1 : s2;
        }
        return s;
    }

    boolean isNiceString(String s, int i, int j) {
        int[] tmp = new int[128];
        for (int t = i; t <= j; t++) {
            tmp[s.charAt(t)]++;

        }

        for (int t = 'a'; t <= 'z'; t++) {
            if (tmp[t] != 0 && tmp[t + 'A' - 'a'] == 0) {
                return false;
            }
            if (tmp[t] == 0 && tmp[t + 'A' - 'a'] != 0) {
                return false;
            }

        }
        return true;
    }

}
