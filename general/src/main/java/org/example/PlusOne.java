package org.example;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int curry = 0;
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int tmp = digits[i] + plus + curry;
            plus = 0;
            curry = tmp / 10;
            digits[i] = tmp % 10;
        }
        if (curry > 0) {
            int[] newData = new int[digits.length + 1];
            newData[0] = curry;
            for (int i = 1; i < newData.length; i++) {
                newData[i] = digits[i - 1];
            }
            return newData;
        }
        return digits;

    }
}
