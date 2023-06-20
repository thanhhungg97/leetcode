package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofWaystoReorderArraytoGetSameBSTTest {
    NumberofWaystoReorderArraytoGetSameBST sut = new NumberofWaystoReorderArraytoGetSameBST();

    @Test
    void test(){
        int i = sut.numOfWays(new int[]{2, 1, 3});

        Assertions.assertEquals(1, i );
    }
    @Test
    void test1(){
        int i = sut.numOfWays(new int[]{3,4,5,1,2});

        Assertions.assertEquals(5, i );
    }

    @Test
    void  test2(){
        int i = sut.numOfWays(new int[]{9, 4, 2, 1, 3, 6, 5, 7, 8});
        Assertions.assertEquals(209, i);
    }
  
}