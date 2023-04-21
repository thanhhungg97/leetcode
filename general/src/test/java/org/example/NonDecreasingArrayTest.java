package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonDecreasingArrayTest {
    NonDecreasingArray sut = new NonDecreasingArray();

    @Test
    void test() {
        boolean b = sut.checkPossibility(new int[]{4, 2, 3});

        Assertions.assertTrue(b);
    }

    @Test
    void test1() {
        boolean b = sut.checkPossibility(new int[]{4, 2, 1});

        Assertions.assertFalse(b);
    }

    @Test
    void test2() {
        boolean b = sut.checkPossibility(new int[]{4, 2});

        Assertions.assertTrue(b);
    }

    @Test
    void test3() {
        boolean b = sut.checkPossibility(new int[]{4, 2, 4});

        Assertions.assertTrue(b);
    }

    @Test
    void test4() {
        boolean b = sut.checkPossibility(new int[]{1,4, 2, 3});

        Assertions.assertTrue(b);
    }
    @Test
    void test5() {
        boolean b = sut.checkPossibility(new int[]{3,4,2,3});

        Assertions.assertFalse(b);
    }
    @Test
    void test6() {
        boolean b = sut.checkPossibility(new int[]{1,4,1,2});

        Assertions.assertTrue(b);
    }


}