package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSum2Test {

    TwoSum2 sut = new TwoSum2();


    @Test
    void test() {
        int[] ints = sut
                .twoSumOptimize(new int[]{2, 7, 11, 15}, 9);

        Assertions.assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void test1() {
        int[] ints = sut
                .twoSumOptimize(new int[]{2, 3, 4}, 6);

        Assertions.assertArrayEquals(new int[]{1, 3}, ints);
    }

    @Test
    void test2() {
        int[] ints = sut
                .twoSumOptimize(new int[]{-1, 0}, -1);

        Assertions.assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void test3() {
        int[] ints = sut
                .twoSumOptimize(new int[]{1,2,3,4,4,9,56,90}, 8);

        Assertions.assertArrayEquals(new int[]{4, 5}, ints);
    }

}