package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_3Test {
    Problem_3 sut = new Problem_3();


    @Test
    void test(){
        int abcabcbb = sut.lengthOfLongestSubstring("abcabcbb");

        Assertions.assertEquals(3, abcabcbb);
    }
    @Test
    void test1(){
        int abcabcbb = sut.lengthOfLongestSubstring("bbbbb");

        Assertions.assertEquals(1, abcabcbb);
    }
    @Test
    void test2(){
        int abcabcbb = sut.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(3, abcabcbb);
    }
    @Test
    void test3(){
        int abcabcbb = sut.lengthOfLongestSubstring("pwwkew");

        Assertions.assertEquals(3, abcabcbb);
    }
    @Test
    void test4(){
        int abcabcbb = sut.lengthOfLongestSubstring("aab");

        Assertions.assertEquals(2, abcabcbb);
    }

}