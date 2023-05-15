package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {
    MinimumSizeSubarraySum sut = new MinimumSizeSubarraySum();

    @Test
    void test(){
        int i = sut.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        Assertions.assertEquals(2, i);
    }
    @Test
    void test1(){
        int i = sut.minSubArrayLen(4, new int[]{2, 3, 1, 2, 4, 3});
        Assertions.assertEquals(1, i);
    }


}