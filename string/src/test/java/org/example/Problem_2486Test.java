package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_2486Test {

    Problem_2486 sut = new Problem_2486();


    @Test
    void test(){
        int i = sut.appendCharacters("coaching", "coding");

        Assertions.assertEquals(4, i);

    }

    @Test
    void test1(){
        int i = sut.appendCharacters("abcde", "a");
        Assertions.assertEquals(0, i);

    }

    @Test
    void test3(){
        int i = sut.appendCharacters("z", "abcde");
        Assertions.assertEquals(5, i);

    }

}