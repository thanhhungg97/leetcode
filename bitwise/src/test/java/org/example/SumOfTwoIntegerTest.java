package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfTwoIntegerTest {
    SumOfTwoInteger sut = new SumOfTwoInteger();
    @Test
    void testcase1(){
        int sum = sut.getSum(1, 2);
        Assertions.assertEquals(3, sum);
    }

    @Test
    void testcase2(){
        int sum = sut.getSum(2, 3);
        Assertions.assertEquals(5, sum);
    }
}