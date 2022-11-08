package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class ThreeSumTest {
    ThreeSum threeSum = new ThreeSum();

    @Test
    void testcase1() {
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        Assertions.assertTrue(lists.equals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1))));
    }

    @Test
    void testcase2() {
        List<List<Integer>> lists = threeSum.threeSum(new int[]{-2, 0, 0, 2, 2});
        Assertions.assertTrue(lists.equals(List.of(List.of(-2, 0, 2))));
    }
}