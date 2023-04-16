package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem_22 {
    public List<String> generateParenthesis(int n) {

        List<String> result = new LinkedList<>();

        dfs(result, 1, 0, 1, n, "(");
        return result;
    }

    private void dfs(List<String> result, int open, int close, int currentSize, int maxSize, String s) {
        if (currentSize == maxSize * 2) {
            result.add(s);
        } else {
            if (open < maxSize) {
                dfs(result, open + 1, close, currentSize + 1, maxSize, s + "(");
            }
            if (close < open) {
                dfs(result, open, close + 1, currentSize + 1, maxSize, s + ")");
            }

        }
    }


}
