package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

    ReverseInteger sut = new ReverseInteger();


    @Test
    void test(){
        int reverse = sut.reverse(123);

        Assertions.assertEquals(321, reverse);
    }

    @Test
    void test1(){
        int reverse = sut.reverse(-123);

        Assertions.assertEquals(-321, reverse);
    }
    @Test
    void test2(){
        int reverse = sut.reverse(-123_567_8909);

        Assertions.assertEquals(0, reverse);
    }
    @Test
    void test3(){
        int reverse = sut.reverse(120);

        Assertions.assertEquals(21, reverse);
    }
}