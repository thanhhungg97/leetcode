package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_724Test {
    Problem_724 sut = new Problem_724();


    @Test
    void test1(){
        int i = sut.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        Assertions.assertEquals(3, i);

    }


    @Test
    void test2(){
        int i = sut.pivotIndex(new int[]{1,2,3});
        Assertions.assertEquals(-1, i);

    }


    @Test
    void test4(){
        int i = sut.pivotIndex(new int[]{2,1,-1});
        Assertions.assertEquals(0, i);

    }
}