package org.example;

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            int tmp = arr[i] - arr[i - 1];
            if (diff != tmp) {
                return false;
            }
        }
        return true;
    }
}
