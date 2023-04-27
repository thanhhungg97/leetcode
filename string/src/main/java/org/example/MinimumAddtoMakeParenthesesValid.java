package org.example;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char aChar : chars) {
            if (aChar == '(') {
                stack.push('(');
                count++;
            } else {
                if (stack.empty()) {
                    count++;
                } else {
                    stack.pop();
                    count--;

                }
            }
        }
        return Math.abs(count);
    }
}
