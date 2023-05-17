package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class TotalSumTest {
    TotalSum sut = new
            TotalSum();

    @Test
    void test() {
        List<String> strings = sut.totalSum("123");
        System.out.println(strings);
    }

    @Test
    void test1() {
        List<String> strings = sut.totalSum("1234");
        System.out.println(strings);
    }

    @Test
    void test2() {
        List<String> strings = sut.totalSum("12345");
        System.out.println(strings);
    }
}