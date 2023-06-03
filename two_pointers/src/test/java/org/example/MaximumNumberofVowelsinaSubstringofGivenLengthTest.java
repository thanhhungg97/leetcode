package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberofVowelsinaSubstringofGivenLengthTest {
    MaximumNumberofVowelsinaSubstringofGivenLength sut = new MaximumNumberofVowelsinaSubstringofGivenLength();

    @Test
    void test(){
        int abciiidef = sut.maxVowels("abciiidef", 3);
        Assertions.assertEquals(3, abciiidef);
    }
    @Test
    void test1(){
        int abciiidef = sut.maxVowels("aeiou", 2);
        Assertions.assertEquals(2, abciiidef);
    }
    @Test
    void test2(){
        int abciiidef = sut.maxVowels("leetcode", 3);
        Assertions.assertEquals(2, abciiidef);
    }
}