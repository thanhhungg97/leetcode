package org.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Idea:
 */
public class FindAllAnagramInString {
    public List<Integer> findAnagrams(String p, String s) {
        int[] hashTable = new int[128];
        int count = s.length();
        int left = 0;
        int right = 0;
        List<Integer> result = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            hashTable[s.charAt(i)]++;
        }
        while (right < p.length()) {
            hashTable[p.charAt(right)]--;
            count--;
            while (hashTable[p.charAt(right)] < 0) {
                count++;
                hashTable[p.charAt(left++)]++;
            }
            if (count == 0) {
                result.add(left);
            }
            right++;
        }
        return result;
    }
}
