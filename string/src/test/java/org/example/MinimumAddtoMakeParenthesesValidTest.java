package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumAddtoMakeParenthesesValidTest {

    MinimumAddtoMakeParenthesesValid sut = new MinimumAddtoMakeParenthesesValid();


    @Test
    void test(){
        int i = sut.minAddToMakeValid("())");
        Assertions.assertEquals(1, i);
    }
    @Test
    void test1(){
        int i = sut.minAddToMakeValid("(((");
        Assertions.assertEquals(3, i);
    }
    @Test
    void test2(){
        int i = sut.minAddToMakeValid("()))((");
        Assertions.assertEquals(4, i);
    }
}