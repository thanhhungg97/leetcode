package org.example;

interface IsSubSequence {
    boolean isSubsequence(String s, String t);
}

class ForLoopSubSequence implements IsSubSequence {

    @Override
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (int j = 0; i < s.length() && j < t.length(); j++) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }
        return i == s.length();
    }
}

/**
 *
 * Idea is start with 0, 0
 * when two character is equal -> increase both
 * when two character not equal -> only increase the old value
 */

class RecursiveIsSubSequence implements IsSubSequence {

    @Override
    public boolean isSubsequence(String s, String t) {
        return recursive(s, t, 0, 0);
    }

    boolean recursive(String s, String t, int m, int n) {
        if (s.length() == n) {
            return true;
        }
        if (t.length() == m) {
            return false;
        }
        if (s.charAt(n) == t.charAt(m)) {
            n++;
            m++;
        } else {
            m++;
        }
        return recursive(s, t, m, n);
    }
}

class MemoizationIsSubSequence implements IsSubSequence{

    @Override
    public boolean isSubsequence(String s, String t) {
        return false;
    }
}