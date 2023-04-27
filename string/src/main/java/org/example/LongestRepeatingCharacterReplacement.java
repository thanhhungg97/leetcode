package org.example;

import java.util.Map;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        Integer result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int b = j + 1 - i;
                if( b >= k){
                    result = Math.max(result, b);
                }
                else{
                    if (canReplace(s.substring(i, j + 1), k)) {

                        result = Math.max(result, b);

                    }
                }


            }
        }
        return result;
    }

    private boolean canReplace(String substring, int k) {
        int[] hash = new int[128];
        char[] chars = substring.toCharArray();
        int max = 0;
        for (char aChar : chars) {
            hash[aChar]++;
            max = Math.max(hash[aChar], max);
        }
        if (substring.length() - max <= k) {
            return true;
        }
        return false;
    }
}
