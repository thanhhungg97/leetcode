package org.example;

public class BackspaceStringCompare {
    public boolean backspaceCompareOptimize(String s, String t) {
        return buildString(s).equals(buildString(t));

    }

    private String buildString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                count++;
            } else {
                if (count > 0) {
                    count--;
                } else {
                    result.append(s.charAt(i));
                }

            }
        }
        return result.toString();
    }

    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;
        int count_s = 0;
        int count_t = 0;

        while (i >= 0 || j >= 0) {
            if (i >= 0 && s.charAt(i) == '#') {
                count_s++;
                i--;
                continue;
            } else {
                if (count_s > 0) {
                    count_s--;
                    i--;
                    continue;
                }
            }
            if (j >= 0 && t.charAt(j) == '#'){
                count_t++;
                j--;
                continue;
            } else{
                if (count_t > 0) {
                    count_t--;
                    j--;
                    continue;
                }
            }
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }
            if ((i >= 0) != (j >= 0)){
                return false;

            }
            i--;
            j--;
        }

        return true;
    }
}
