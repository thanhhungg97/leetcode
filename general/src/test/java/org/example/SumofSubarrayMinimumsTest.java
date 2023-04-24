package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumofSubarrayMinimumsTest {
    SumofSubarrayMinimums sut = new SumofSubarrayMinimums();

    @Test
    void test() {
        int i = sut.sumSubarrayMins(new int[]{3, 1, 2, 4});
        Assertions.assertEquals(17, i);
    }

    @Test
    void test1() {
        int i = sut.sumSubarrayMins(new int[]{11, 81, 94, 43, 3});
        Assertions.assertEquals(444, i);
    }

}