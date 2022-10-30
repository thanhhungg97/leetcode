package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotateArrayTest {
    FindMinimumInRotateArray sut = new FindMinimumInRotateArray();
    @Test
    void testcase1() {
        int[] array = new int[]{3, 4, 5, 1, 2};
        Assertions.assertEquals(1, sut.findMin(array));
    }
    @Test
    void testcase2() {
        int[] array = new int[]{3};
        Assertions.assertEquals(3, sut.findMin(array));
    }
}