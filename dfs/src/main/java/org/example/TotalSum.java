package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TotalSum {

    List<String> totalSum(String s) {
        List<String> stringList = new ArrayList<>();
        char[] chars = s.toCharArray();
        helper(1, String.valueOf(chars[0]), chars, stringList);
        Integer reduce = stringList.stream().map(item -> {
            String[] split = item.split("\\+");
            return Arrays
                    .stream(split)
                    .toList()
                    .stream()
                    .map(Integer::valueOf)
                    .reduce(0, Integer::sum);
        }).reduce(0, Integer::sum);
        System.out.println(reduce);
        return stringList;
    }

    void helper(int i, String s, char[] chars, List<String> result) {
        if (i == chars.length) {
            result.add(s);
        } else {
            helper(i + 1, s + chars[i], chars, result);
            helper(i + 1, s + "+" + chars[i], chars, result);
        }
    }
}
