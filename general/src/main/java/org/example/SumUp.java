package org.example;

public class SumUp {
    int getSum(int n) {
        int result = 0;

        int tmp = n / 9;
        int i = 0;
        while (tmp > 0) {
            result += (int) (Math.pow(10, i) * 9);
            i++;
            tmp--;
        }
        result += (int) (Math.pow(10,i)) * (n % 9);
        return result;

    }
}
