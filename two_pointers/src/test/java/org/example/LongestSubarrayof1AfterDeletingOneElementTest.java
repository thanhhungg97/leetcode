package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubarrayof1AfterDeletingOneElementTest {
    LongestSubarrayof1AfterDeletingOneElement sut = new LongestSubarrayof1AfterDeletingOneElement();

    @Test
    void test(){
        int i = sut.longestSubarray(new int[]{1, 1, 0, 1});
        Assertions.assertEquals(3, i );
    }
    @Test
    void test1(){
        int i = sut.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1});
        Assertions.assertEquals(5, i );
    }
}