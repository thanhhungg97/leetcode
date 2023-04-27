package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReorganizeStringTest {

    ReorganizeString sut = new ReorganizeString();

    @Test
    void test(){
        String aab = sut.reorganizeStringOptimize("aab");

        Assertions.assertEquals("aba", aab);

    }
    @Test
    void test1(){
        String aab = sut.reorganizeStringOptimize("aaab");

        Assertions.assertEquals("", aab);

    }

    @Test
    void test4(){
        String aab = sut.reorganizeStringOptimize("aaabbbb");

        Assertions.assertEquals("bababab", aab);

    }
    @Test
    void test5(){
        String aab = sut.reorganizeStringOptimize("aaabbbbb");

        Assertions.assertEquals("", aab);

    }
}