package org.example;

public class ReverseInteger {
    public int reverse(int x) {

        return x < 0 ? reverseForNegative(x) : reverseForPositive(x);


    }

    private int reverseForPositive(int x) {
        int result = 0;
        int numDigits = countNumDigits(x) - 1;

        while (x != 0) {
            int tmp = x % 10;
            int attempt = (int) (tmp * Math.pow(10, numDigits));
            numDigits--;
            if (Integer.MAX_VALUE - result < attempt) {
                return 0;
            } else {
                result = result + attempt;
            }
            x = x / 10;
        }
        return result;
    }

    private int reverseForNegative(int x) {
        int result = 0;
        int numDigits = countNumDigits(x) - 1;

        while (x != 0) {
            int tmp = x % 10;
            int attempt = (int) (tmp * Math.pow(10, numDigits));
            numDigits--;
            if (attempt < Integer.MIN_VALUE - result) {
                return 0;
            } else {
                result = result + attempt;
            }
            x = x / 10;
        }
        return result;
    }

    int countNumDigits(int x) {
        int count = 0;
        while (x != 0) {
            count++;
            x = x / 10;
        }
        return count;
    }
}
