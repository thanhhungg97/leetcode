package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_1768Test {
    Problem_1768 sut = new Problem_1768();

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