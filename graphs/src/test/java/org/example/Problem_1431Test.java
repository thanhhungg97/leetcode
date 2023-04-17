package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_1431Test {
    Problem_1431 sut = new Problem_1431();


    @Test
    void test() {
        List<Boolean> booleans = sut.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

        Assertions.assertEquals(List.of(true, true, true, false, true), booleans);
    }

    @Test
    void test1() {
        List<Boolean> booleans = sut.kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);

        Assertions.assertEquals(List.of(true, false, false, false, false), booleans);
    }

    @Test
    void test2() {
        List<Boolean> booleans = sut.kidsWithCandies(new int[]{12, 1, 12}, 10);

        Assertions.assertEquals(List.of(true, false, true), booleans);
    }

}