package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestNiceSubstringTest {

    LongestNiceSubstring sut = new LongestNiceSubstring();


    @Test
    void test(){
        String yazaAay = sut.longestNiceSubstringOptional2("YazaAay");

        Assertions.assertEquals("aAa", yazaAay);
    }

    @Test
    void test1(){
        String yazaAay = sut.longestNiceSubstringOptional2("Bb");

        Assertions.assertEquals("Bb", yazaAay);
    }

    @Test
    void test2(){
        String yazaAay = sut.longestNiceSubstringOptional2("c");

        Assertions.assertEquals("", yazaAay);
    }

  @Test
    void test3(){
        String dDzeE = sut
                .longestNiceSubstringOptional2("dDzeE");

        Assertions.assertEquals("dD", dDzeE);

    }

}