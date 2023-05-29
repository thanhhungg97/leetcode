package org.example;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] tmpArray = Arrays.copyOf(heights, heights.length);
        Arrays.sort(tmpArray);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != tmpArray[i]) {
                count += 1;
            }
        }
        return count;
    }
}
