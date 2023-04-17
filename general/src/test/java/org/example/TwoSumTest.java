package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class TwoSumTest {
    TwoSum sut = new TwoSum();

    @Test
    void test() {
        List<Integer> test = new LinkedList<>();
        test.add(4);
        test.add(17);
        test.add(12);
        test.add(5);
        test.add(9);
        sut.towSum(test);
        Assertions.assertTrue(List.of(4, 5, 12, 12, 5, 9).equals(test));
    }

    @Test
    void tes1() {

        int[] ints = sut.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, ints);
    }

    @Test
    void tes2() {
        int[] ints = sut.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void tes3() {
        int[] ints = sut.twoSum(new int[]{3, 3}, 6);
        Assertions.assertArrayEquals(new int[]{0, 1}, ints);
    }
}
