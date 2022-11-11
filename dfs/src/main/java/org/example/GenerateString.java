package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenerateString {
    List<String> generateString(List<Integer> array, int n) {

        List<String> tmp = new ArrayList<>();

        backtrack(array, tmp, "", 0, n);
        return tmp;

    }

    void backtrack(List<Integer> array, List<String> tmp, String curString, int i, int n) {
        if (curString.length() == n) {
            tmp.add(curString);
        }
        for (; i < array.size(); i++) {
            String tmpString = curString;
            curString = curString + array.get(i);
            backtrack(array, tmp, curString, i + 1, n);
            curString = tmpString;
        }

    }

}
