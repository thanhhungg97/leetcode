package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class FactorialTrailingZeroesTest {
    FactorialTrailingZeroes sut = new FactorialTrailingZeroes();

    @Test
    void testFactorial(){
        int trailingZeroes = sut.trailingZeroes(5);
        Assertions.assertEquals(1, trailingZeroes);
    }

    @Test
    void testFactorial1(){
        int trailingZeroes = sut.trailingZeroes(13);
        Assertions.assertEquals(2, trailingZeroes);
    }
}