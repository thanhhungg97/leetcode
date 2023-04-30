package org.example;

import java.util.Arrays;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacementOptimize2(String s, int k) {
        int[] hash = new int[128];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i)]++;
        }
        int max = 0;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0) {
                max = Math.max(max, characterReplacement(s, i, k));
            }
        }
        return max;
    }

    /**
     * ABABB, K = 2
     *
     * @param s
     * @param hash
     * @param k
     * @return
     */
    private int characterReplacement(String s, int hash, int k) {
        int i = 0;
        int j = 0;
        int max = 0;
        int count = 0;
        while (j < s.length()) {
            if (s.charAt(j) == hash) {
                count++;
            }
            while (!isValidWindow(j, i, count, k)) {
                if (s.charAt(i) == hash) {
                    count--;
                }
                i++;
            }
            max = Math.max(j - i + 1, max);
            j++;
        }
        return max;
    }

    private boolean isValidWindow(int j, int i, int count, int k) {

        return j - i + 1 - count <= k;
    }

    public int characterReplacement(String s, int k) {
        Integer result = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int b = j + 1 - i;
                if (b >= k) {
                    result = Math.max(result, b);
                } else {
                    if (canReplace(s.substring(i, j + 1), k)) {

                        result = Math.max(result, b);

                    }
                }

            }
        }
        return result;
    }

    public int characterReplacementOptimize(String s, int k) {
        int lo = 1;
        int hi = s.length() + 1;
        int result = 1;
        while (lo < hi - 1) {
            int mid = lo + (hi - lo) / 2;
            if (valid(s, mid, k)) {
                result = Math.max(result, mid);
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return result;
    }

    private boolean valid(String s, int windown, int k) {
        int[] hash = new int[128];
        for (int i = 0; i < s.length(); i++) {
            if (i < windown) {
                hash[s.charAt(i)]++;
            } else {
                int max = Arrays.stream(hash).max().getAsInt();
                if (windown - max <= k) {
                    return true;
                }
                hash[s.charAt(i - windown)]--;
                hash[s.charAt(i)]++;
            }

        }
        int max = Arrays.stream(hash).max().getAsInt();
        if (windown - max <= k) {
            return true;
        }
        return false;
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
