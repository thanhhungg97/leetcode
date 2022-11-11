package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SubarrayProductLessThanKTest {
    SubarrayProductLessThanK subarrayProductLessThanK = new SubarrayProductLessThanK();

    @Test
    void testcase1() {
        int i = subarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
        Assertions.assertEquals(8, i );
    }

}