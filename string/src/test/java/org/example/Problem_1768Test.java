package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_1768Test {
    MergeAlternatively sut = new MergeAlternatively();

    @Test
    void test(){

        String s = sut.mergeAlternately("abc", "pqr");

        Assertions.assertEquals("apbqcr", s);
    }
    @Test
    void tes2(){

        String s = sut.mergeAlternately("ab", "pqrs");

        Assertions.assertEquals("apbqrs", s);
    }

    @Test
    void tes3(){

        String s = sut.mergeAlternately("abcd", "pq");

        Assertions.assertEquals("apbqcd", s);
    }


}