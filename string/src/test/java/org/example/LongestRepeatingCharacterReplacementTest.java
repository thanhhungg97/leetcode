package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestRepeatingCharacterReplacementTest {

    LongestRepeatingCharacterReplacement sut = new LongestRepeatingCharacterReplacement();


    @Test
    void test(){
        int abab = sut.characterReplacementOptimize("ABAB", 2);
        Assertions.assertEquals(4, abab);
    }
    @Test
    void test6(){
        int abab = sut.characterReplacementOptimize("AABA", 0);
        Assertions.assertEquals(2, abab);
    }

    @Test
    void test1(){
        int abab = sut.characterReplacementOptimize("AABABBA", 1);
        Assertions.assertEquals(4, abab);
    }
    //ABBB
    @Test
    void test2(){
        int abab = sut.characterReplacementOptimize("ABBB", 2);
        Assertions.assertEquals(4, abab);
    }

    @Test
    void test3(){
        int cddb = sut.characterReplacementOptimize("ABBB", 2);

        Assertions.assertEquals(4, cddb);
    }
}