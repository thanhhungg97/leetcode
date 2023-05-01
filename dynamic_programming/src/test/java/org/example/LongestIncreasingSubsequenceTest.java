package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence sut = new LongestIncreasingSubsequence();


    @Test
    void test(){
        int i = sut.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18});
        Assertions.assertEquals(4, i);
    }

    @Test
    void test3(){
        //4,10,4,3,8,9
        int i = sut.lengthOfLIS(new int[]{4,10,4,3,8,9});
        Assertions.assertEquals(3, i);
    }

    @Test
    void test1(){
        int i = sut.lengthOfLIS(new int[]{0,1,0,3,2,3});
        Assertions.assertEquals(4, i);
    }

    @Test
    void test2(){
        int i = sut.lengthOfLIS(new int[]{7,7,7,7,7,7,7});
        Assertions.assertEquals(1, i);
    }
}