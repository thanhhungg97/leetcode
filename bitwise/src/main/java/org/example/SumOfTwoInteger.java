package org.example;

/**
 *  a = 3  -> 011
 *  b = 2 -> 010
 *  a & b = 0 1 0 = 2
 *  a ^ b = 0 0 1
 *  a | b = 0 1 1
 *  ~ a = 1 0 0
 *  ~ b = 1 0 1
 *  3 + 2 = 5 = 1 0 1
 *
 */


public class SumOfTwoInteger {
    public int getSum(int a, int b) {
        int c;
        while (b != 0){
            c = a & b;
            a = a ^ b;
            b = c << 1;
        }
        return a;
    }
}
