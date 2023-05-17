package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoinChangeTest {
    CoinChange coinChange = new CoinChange();

    @Test
    void test() {
        int i = coinChange.coinChange(new int[]{1, 2, 5}, 11);
        Assertions.assertEquals(3, i);
    }

    @Test
    void test1() {
        int i = coinChange.coinChange(new int[]{2}, 3);
        Assertions.assertEquals(-1, i);
    }

    @Test
    void test2() {
        int i = coinChange.coinChange(new int[]{1}, 0);
        Assertions.assertEquals(0, i);
    }
    @Test
    void test3() {
        int i = coinChange.coinChange(new int[]{186,419,83,408}, 6249);
        Assertions.assertEquals(20, i);
    }
    @Test
    void test4() {
        int i = coinChange.coinChange(new int[]{2147483647}, 2);
        Assertions.assertEquals(-1, i);
    }
    @Test
    void test5() {
        int i = coinChange.coinChange(new int[]{2,5,10,1}, 27);
        Assertions.assertEquals(4, i);
    }
}