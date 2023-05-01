package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {
    MaximumSubarray sut = new MaximumSubarray();

    @Test
    void test(){

        int i = sut.
                maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});

        Assertions.assertEquals(6, i);
    }

}