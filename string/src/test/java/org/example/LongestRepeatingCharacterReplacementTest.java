package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement sut = new LongestRepeatingCharacterReplacement();


    @Test
    void test(){
        int abab = sut.characterReplacement("ABAB", 2);
        Assertions.assertEquals(4, abab);
    }

    @Test
    void test1(){
        int abab = sut.characterReplacement("AABABBA", 1);
        Assertions.assertEquals(4, abab);
    }
    //ABBB
    @Test
    void test2(){
        int abab = sut.characterReplacement("ABBB", 2);
        Assertions.assertEquals(4, abab);
    }

    @Test
    void test3(){
        int cddb = sut.characterReplacement("ABBB", 2);

        Assertions.assertEquals(4, cddb);
    }
}