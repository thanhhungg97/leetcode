package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlusOneTest {
    PlusOne sut = new PlusOne();

    @Test
    void test() {
        int[] ints = sut.plusOne(new int[]{1, 2, 3});

        Assertions.assertArrayEquals(new int[]{1, 2, 4}, ints);
    }

    @Test
    void test1() {
        int[] ints = sut.plusOne(new int[]{9});

        Assertions.assertArrayEquals(new int[]{1, 0}, ints);
    }

    @Test
    void test3() {
        int[] ints = sut.plusOne(new int[]{4, 3, 2, 1});

        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, ints);
    }


}