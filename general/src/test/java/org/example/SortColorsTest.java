package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortColorsTest {

    SortColors sut = new SortColors();


    @Test
    void test() {
        int[] ints = {2, 0, 2, 1, 1, 0};
        sut.sortColors(ints);
        Assertions.assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, ints);
    }

    @Test
    void test1() {
        int[] nums = {2, 0, 1};
        sut.sortColors(nums);

        Assertions.assertArrayEquals(new int[]{0, 1, 2}, nums);
    }

    @Test
    void test3() {
        int[] nums = {0};
        sut.sortColors(nums);

        Assertions.assertArrayEquals(new int[]{0}, nums);
    }
}