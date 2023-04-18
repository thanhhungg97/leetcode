package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    ReverseString sut = new ReverseString();


    @Test
    void test() {
        char[] tmp = new char[]{'h', 'e', 'l', 'l', 'o'};
        sut.reverseString(tmp);
        Assertions.assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, tmp);
    }
}