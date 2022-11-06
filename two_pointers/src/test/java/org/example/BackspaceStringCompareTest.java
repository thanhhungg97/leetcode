package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackspaceStringCompareTest {
    BackspaceStringCompare sut = new BackspaceStringCompare();
    @Test
    void testcase1(){
       Assertions.assertTrue(sut.backspaceCompare( "ab#c", "ad#c"));
    }
    @Test
    void testcase2(){
        Assertions.assertFalse(sut.backspaceCompare( "a#c", "b"));
    }
    @Test
    void testcase3(){
        Assertions.assertFalse(sut.backspaceCompare( "a#", "a"));
    }
    @Test
    void testcase4(){
        Assertions.assertTrue(sut.backspaceCompare( "a", "a"));
    }
}