package org.example;

import java.util.LinkedList;
import java.util.List;

public class Problem_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if (extraCandies + candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);

            }
        }
        return result;
    }
}
