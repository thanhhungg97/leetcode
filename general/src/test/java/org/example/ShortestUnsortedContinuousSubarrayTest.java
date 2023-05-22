package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestUnsortedContinuousSubarrayTest {
    ShortestUnsortedContinuousSubarray sut = new ShortestUnsortedContinuousSubarray();

    @Test
    void test() {
        int unsortedSubarray = sut.findUnsortedSubarrayOptimize(new int[]{2, 6, 4, 8, 10, 9, 15});

        Assertions.assertEquals(5, unsortedSubarray);
    }

    @Test
    void test1() {
        int unsortedSubarray = sut.findUnsortedSubarrayOptimize(new int[]{1, 2, 3, 4});

        Assertions.assertEquals(0, unsortedSubarray);
    }
}