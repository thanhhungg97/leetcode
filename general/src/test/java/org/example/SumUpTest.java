package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumUpTest {

    SumUp sumUp = new SumUp();


    @Test
    void test(){
        int sum = sumUp.getSum(16);

        Assertions.assertEquals(79, sum);
    }
    @Test
    void test1(){
        int sum = sumUp.getSum(19);

        Assertions.assertEquals(199, sum);
    }

}