package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveTrailingZerosFromaStringTest {
    RemoveTrailingZerosFromaString sut = new RemoveTrailingZerosFromaString();

    @Test
    void test(){
        String s = sut
                .removeTrailingZeros("51230100");
        Assertions.assertEquals("512301", s);

    }
    @Test
    void test1(){
        String s = sut
                .removeTrailingZeros("123");
        Assertions.assertEquals("123", s);

    }
    @Test
    void test2(){
        String s = sut
                .removeTrailingZeros("0");
        Assertions.assertEquals("", s);

    }

    @Test
    void test3(){
        String s = sut
                .removeTrailingZeros("10");
        Assertions.assertEquals("1", s);

    }
    @Test
    void test4(){
        String s = sut
                .removeTrailingZeros("010");
        Assertions.assertEquals("01", s);

    }
}