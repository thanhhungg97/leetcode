package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CountPrimesTest {

    CountPrimes sut = new CountPrimes();


    @Test
    void test() {
        int i = sut.countPrimes(10);

        Assertions.assertEquals(4, i);

    }

    @Test
    void test1() {
        int i = sut.countPrimes(41537);

        Assertions.assertEquals(4343, i);

    }
}