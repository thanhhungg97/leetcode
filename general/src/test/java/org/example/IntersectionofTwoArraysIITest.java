package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class IntersectionofTwoArraysIITest {
    IntersectionofTwoArraysII sut = new IntersectionofTwoArraysII();


    @Test
    void test() {
        int[] intersect = sut.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        Assertions.assertArrayEquals(new int[]{2, 2}, intersect);
    }

    @Test
    void test1() {
        int[] intersect = sut.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        Assertions.assertArrayEquals(new int[]{9, 4}, intersect);
    }

    @Test
    void test2() {
        int[] intersect = sut.intersect(new int[]{}, new int[]{9, 4, 9, 8, 4});

        Assertions.assertArrayEquals(new int[]{}, intersect);
    }

    @Test
    void test3() {
        int[] intersect = sut.intersectForSortedArray(new int[]{1, 1, 2, 2}, new int[]{2, 2});

        Assertions.assertArrayEquals(new int[]{2, 2}, intersect);

    }

    @Test
    void test4() {
        int[] intersect = sut.intersectForSortedArray(new int[]{4, 4, 8, 9}, new int[]{4, 5, 9});

        Assertions.assertArrayEquals(new int[]{4, 9}, intersect);

    }

}