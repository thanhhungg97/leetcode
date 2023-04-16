package org.example;

public class Problem_2116 {
    public boolean canBeValid(String s, String locked) {
        if (s.length() % 2 != 0) return false;
        int balance = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || locked.charAt(i) - '0' == 0) {
                balance++;

            } else if (s.charAt(i) == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        balance = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == ')' || locked.charAt(i) - '0' == 0) {
                balance++;

            } else if (s.charAt(i) == '(') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }
        return true;
    }

    boolean canBeValidRecursive(String s, String locked) {
        return canBeValidRecursive(0, s, 0, locked);
    }

    //(())
    //0110

    //(
    //)
    //
    boolean canBeValidRecursive(int currBalance, String s, int index, String locked) {
        if (index == s.length()) {
            return currBalance == 0;
        } else {
            if( currBalance < 0 ){
                return false;
            }
            else{
                if (locked.charAt(index) - '0' == 0) {
                    return canBeValidRecursive(currBalance + 1, s, index + 1, locked)
                            || canBeValidRecursive(currBalance - 1, s, index + 1, locked);
                } else {
                    if (s.charAt(index) == '(') {
                        return canBeValidRecursive(currBalance + 1, s, index + 1, locked);
                    } else {
                        return canBeValidRecursive(currBalance - 1, s, index + 1, locked);
                    }
                }
            }
        }
    }
}
