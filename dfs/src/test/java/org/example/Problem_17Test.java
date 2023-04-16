package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Problem_17Test {
    Problem_17 sut = new Problem_17();

    @Test
    void test1() {
        List<String> strings =
                sut.letterCombinations("23");

        Assertions.assertEquals(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), strings);
    }

    @Test
    void test2() {
        List<String> strings =
                sut.letterCombinations("");

        Assertions.assertEquals(List.of(), strings);
    }

    @Test
    void test3() {
        List<String> strings =
                sut.letterCombinations("2");

        Assertions.assertEquals(List.of("a", "b", "c"), strings);
    }
}