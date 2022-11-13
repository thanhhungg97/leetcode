package org.example;

public class Subtract {

    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println(preprocess("2123", "987" ));
    }

    public static String preprocess(String number1, String number2) {
        if (number1.length() < number2.length()) {
            int i = number1.length();
            while (i < number2.length()) {
                number1 = "0" + number1;
                i++;
            }
            return "-" + subtract(number1, number2);
        } else {
            int i = number2.length();
            while (i < number1.length()) {
                number2 = "0" + number2;
                i++;
            }
            return subtract(number1, number2);
        }
    }

    public static String subtract(String number1, String number2) {
        int i = number1.length() - 1;
        int count = 0;
        boolean borrow = false;
        double result = 0;
        while (i >= 0) {
            int t1 = number1.charAt(i) - 48;
            if (borrow == true) {
                t1--;
            }
            int t2 = number2.charAt(i) - 48;

            if (t2 > t1) {
                borrow = true;
                t1 = t1 + 10;
            }
            int tmp = t1 - t2;
            result = result + tmp * Math.pow(10, count);
            i--;
            count++;
        }

        return String.valueOf(result);

    }
}
