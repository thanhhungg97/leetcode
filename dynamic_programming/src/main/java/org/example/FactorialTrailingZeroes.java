package org.example;

import java.math.BigDecimal;

public class FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        BigDecimal factorial = getFactorial(n);
        int count = 0;
        while (factorial.remainder(BigDecimal.TEN).equals(BigDecimal.ZERO)) {
            count++;
            factorial = factorial.divide(BigDecimal.TEN);
        }
        return count;
    }

    private BigDecimal getFactorial(int n) {
        BigDecimal a = BigDecimal.ONE;
        for (int i = 2; i <= n; i++) {
            a = a.multiply(BigDecimal.valueOf(i));
        }
        return a;
    }
}
