package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_1480Test {
    Problem_1480 sut = new Problem_1480();

    @Test
    void test1(){
        int[] ints = sut.runningSum(new int[]{1, 2, 3, 4});

        Assertions.assertArrayEquals(new int[]{1,3,6,10}, ints);
    }
}