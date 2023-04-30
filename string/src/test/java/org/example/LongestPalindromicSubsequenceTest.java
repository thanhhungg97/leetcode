package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestPalindromicSubsequenceTest {
    LongestPalindromicSubsequence sut = new LongestPalindromicSubsequence();

    @Test
    void test(){

        int bbbab = sut.longestPalindromeSubseqOptimize("bbbab");

        Assertions.assertEquals(4, bbbab);
    }
    @Test
    void tes3(){

        int bbbab = sut.longestPalindromeSubseqOptimize("a");

        Assertions.assertEquals(1, bbbab);
    }
    @Test
    void test2(){

        int bbbab = sut.longestPalindromeSubseqOptimize("abcdcba");

        Assertions.assertEquals(7, bbbab);
    }

    @Test
    void test1(){

        int bbbab = sut.longestPalindromeSubseqOptimize("cbbd");

        Assertions.assertEquals(2, bbbab);
    }


}