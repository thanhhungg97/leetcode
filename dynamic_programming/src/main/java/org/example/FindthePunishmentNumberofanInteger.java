package org.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindthePunishmentNumberofanInteger {
    public int punishmentNumber(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            if (isValid(i * i, i)) {
                result += i * i;
            }

        }

        return result;
    }

    boolean isValid(int square, int raw) {
        String s = String.valueOf(square);
        List<String> result = new LinkedList<>();
        help(String.valueOf(square), 1, String.valueOf(s.charAt(0)), result);

        return result.stream().map(item -> Arrays.stream(item.split(",")).map(Integer::valueOf).toList()).filter(item -> item.size() > 1)
                .map(item -> item.stream().reduce(0, Integer::sum)).anyMatch(item -> item == raw);


    }

    private void help(String square, int i, String s, List<String> result) {
        if (i == square.length()) {
            result.add(s);
        } else {
            help(square, i + 1, s + square.charAt(i), result);
            help(square, i + 1, s + "," + square.charAt(i), result);
        }
    }

}
