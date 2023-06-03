package org.example;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

    public int maxVowels(String s, int k) {
        int start = 0;
        char[] vowel = new char[128];
        vowel['a'] = 1;
        vowel['e'] = 1;
        vowel['i'] = 1;
        vowel['o'] = 1;
        vowel['u'] = 1;


        char[] chars = s.toCharArray();
        int count = 0;
        int max = 0;
        for (int end = 0; end < chars.length; end++) {
            if (vowel[chars[end]] == 1) {
                count++;
            }
            while (end - start >= k) {
                if (vowel[chars[start]] == 1) {
                    count--;
                }
                start++;
            }
            max = Math.max(count, max);

        }
        return max;
    }
}
