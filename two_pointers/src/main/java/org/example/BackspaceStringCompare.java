package org.example;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String s, String t) {
        return backspace(s).equals(backspace(t));
    }

    private String backspace(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i++) {

        }
        int lastIndex = s.length() - 1;
        for (; lastIndex >= 0; lastIndex--) {
            while (s.charAt(lastIndex) != '#') {
                lastIndex--;
            }
        }
        int backspaceCount = 0 ;
        int abcCount = 0 ;
        for (int i = 0; i <= lastIndex; i++) {
            if( s.charAt(i) == '#' ){
                backspaceCount ++;
            }
            else{
                abcCount ++;
            }

        }
        return result.toString();
    }
}
