package org.example;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class TotalSum {
    public static void main(String[] args) {
        //    "1+2+3" ->  total
        //          "1+2+3", "12+3", "1+23", "123"
        //                6 , 15, 24 -> 123 + 45
        List<String> totalSum = getTotalSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10);

        System.out.println(totalSum);
    }

    static List<String> getTotalSum(int[] data, int total) {
        List<String> result = new LinkedList<>();

        helper(data, 0, total, "", result);
        return result;
    }


    static void helper(int[] data, int i, int total, String curr, List<String> result) {
        if (i == data.length) {
            return;
        }
        int currentData = data[i];
        if (total == 0) {
            result.add(curr);
        } else {
            if (i == 0) {
                helper(data, i + 1, total - currentData, String.valueOf(currentData), result);
            } else {
                helper(data, i + 1, total - currentData, curr + "+" + currentData, result);
                helper(data, i + 1, total + currentData, curr + "-" + currentData, result);
            }
        }
    }
}
