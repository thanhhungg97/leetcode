package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImplementStrTest {

    ImplementStr sut = new ImplementStr();

    @Test
    void test() {
        int i = sut.strStr("sadbutsad", "sad");

        Assertions.assertEquals(0, i);
    }

    @Test
    void test1() {
        int i = sut.strStr("leetcode", "leeto");

        Assertions.assertEquals(-1,  i);
    }
}