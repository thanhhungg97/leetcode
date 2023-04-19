package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermutationInStringTest {
    PermutationInString sut = new PermutationInString();


    @Test
    void test(){
        boolean b = sut.checkInclusionOptimize("ab", "eidbaooo");

        Assertions.assertTrue(b);
    }

    @Test
    void test1(){
        boolean b = sut.checkInclusionOptimize("ab", "eidboaoo");

        Assertions.assertFalse(b);
    }

    @Test
    void test3(){
        boolean b = sut.checkInclusionOptimize("a", "b");

        Assertions.assertFalse(b);
    }

    @Test
    void test2(){
        boolean b = sut.checkInclusionOptimize("b", "b");

        Assertions.assertTrue(b);
    }
    @Test
    void test4(){
        boolean b = sut.checkInclusionOptimize("adc", "dcda");

        Assertions.assertTrue(b);
    }
}