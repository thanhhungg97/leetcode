package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_283Test {
    Problem_283 sut = new Problem_283();


    @Test
    void test() {
        int[] test = new int[]{0, 1, 0, 3, 12};
        sut.moveZeroes(test);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, test);
    }
    @Test
    void test1() {
        int[] test = new int[]{0};
        sut.moveZeroes(test);
        Assertions.assertArrayEquals(new int[]{0}, test);
    }

}