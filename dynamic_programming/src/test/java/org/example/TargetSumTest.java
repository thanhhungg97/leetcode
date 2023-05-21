package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TargetSumTest {
    TargetSum sut = new TargetSum();
    @Test
    void test(){


        int targetSumWays = sut.findTargetSumWays(new int[]{
                1,1,1,1
        }, 3);
        Assertions.assertEquals(5, targetSumWays);

    }
    @Test
    void test1(){


        int targetSumWays = sut.findTargetSumWays(new int[]{
                1
        },1);
        Assertions.assertEquals(1, targetSumWays);

    }


}