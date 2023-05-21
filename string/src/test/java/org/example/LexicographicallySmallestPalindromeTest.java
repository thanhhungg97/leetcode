package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexicographicallySmallestPalindromeTest {
    LexicographicallySmallestPalindrome sut = new LexicographicallySmallestPalindrome();


    @Test
    void test(){
        String egcfe = sut
                .makeSmallestPalindrome("egcfe");

        Assertions.assertEquals("efcfe", egcfe);
    }
    @Test
    void test2(){
        String egcfe = sut
                .makeSmallestPalindrome("abcd");

        Assertions.assertEquals("abba", egcfe);
    }
    @Test
    void test3(){
        String egcfe = sut
                .makeSmallestPalindrome("seven");

        Assertions.assertEquals("neven", egcfe);
    }


}