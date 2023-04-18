package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {

    StringToInteger sut = new StringToInteger();


    @Test
    void test() {
        int i = sut.myAtoi("42");
        Assertions.assertEquals(42, i);
    }

    @Test
    void test1() {
        int i = sut.myAtoi("   -42");
        Assertions.assertEquals(-42, i);
    }

    @Test
    void test2() {
        int i = sut.myAtoi("4193 with words");
        Assertions.assertEquals(4193, i);
    }
    @Test
    void test3() {
        int i = sut.myAtoi("words and 987");
        Assertions.assertEquals(0, i);
    }
    @Test
    void test4() {
        int i = sut.myAtoi("3.14159");
        Assertions.assertEquals(3, i);
    }
}