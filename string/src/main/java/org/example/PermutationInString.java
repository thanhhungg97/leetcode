package org.example;

public class PermutationInString {
    /**
     * Time complexity O(m*n)
     * Space complexity O(n)
     */

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {// m - n  -> ( m - n ) * n =  m * n
            if (isAnagram(s1, s2, i)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusionOptimize(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }

        int[] hash = new int[128];
        int[] hash1 = new int[128];


        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i)]++;
        }
        for (int i = 0; i < s1.length(); i++) {
            hash1[s2.charAt(i)]++;
        }
        int j = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            if (isEqual(hash1, hash)) {
                return true;
            } else {
                hash1[s2.charAt(i)]++;
                hash1[s2.charAt(j)]--;
                j++;
            }

        }
        if(isEqual(hash1, hash)){
            return true;
        }
        return false;
    }

    public boolean isEqual(int[] hash1, int[] hash2) {
        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] != hash2[i]) {
                return false;
            }
        }
        return true;

    }

    boolean isAnagram(String s1, String s2, int left) { // n
        int[] hash = new int[128];
        for (int i = 0; i < s1.length(); i++) {
            hash[s1.charAt(i)]++;
        }
        for (int i = left; i < left + s1.length(); i++) {
            int count = --hash[s2.charAt(i)];
            if (count < 0) {
                return false;
            }
        }
        return true;
    }
}
