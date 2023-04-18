package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseWordTest {

    ReverseWord sut = new ReverseWord();


    @Test
    void test(){
        String s = sut
                .reverseWords("Let's take LeetCode contest");

        Assertions.assertEquals("s'teL ekat edoCteeL tsetnoc", s);
    }

    @Test
    void test1(){
        String s = sut
                .reverseWords("God Ding");

        Assertions.assertEquals("doG gniD", s);
    }

}