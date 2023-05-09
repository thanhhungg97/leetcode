package org.example;

public class SignoftheProductofanArray {
    public int arraySign(int[] nums) {
        int countNegative = 0;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            }
            if (num < 0) {
                countNegative++;
            }
        }
        if (countNegative % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
