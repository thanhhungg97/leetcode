package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_238Test {
    Problem_238 sut = new Problem_238();


    @Test
    void test() {
        int[] ints = sut.productExceptSelf(new int[]{1, 2, 3, 4});

        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, ints);

    }

    @Test
    void test1() {
        int[] ints = sut.productExceptSelf(new int[]{-1, 1, 0, -3, 3});

        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, ints);

    }

    @Test
    void test2() {
        int[] ints = sut.productExceptSelf(new int[]{1, 2});

        Assertions.assertArrayEquals(new int[]{2, 1}, ints);

    }
}