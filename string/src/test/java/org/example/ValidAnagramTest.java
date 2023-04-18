package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    ValidAnagram sut = new ValidAnagram();


    @Test
    void test(){
        boolean anagram = sut.isAnagram("anagram", "nagaram");
        Assertions.assertTrue(anagram);

    }

    @Test
    void test1(){
        boolean anagram = sut.isAnagram("rat", "car");
        Assertions.assertFalse(anagram);

    }



}