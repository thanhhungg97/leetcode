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
}