package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinNumTest {

    @Test
    void test(){
        int i = MinNum.minNum(3, 5, 5);
        Assertions
                .assertEquals(3, i);

    }
    @Test
    void test1(){
        int i = MinNum.minNum(3, 5, 1);
        Assertions
                .assertEquals(1, i);

    }
    @Test
    void test2(){
        int i = MinNum.minNum(4, 5, 1);
        Assertions
                .assertEquals(2, i);

    }
    @Test
    void test3(){
        int i = MinNum.minNum(5, 5, 1);
        Assertions
                .assertEquals(-1, i);

    }
    @Test
    void test4(){
        int i = MinNum.minNum(5, 5, 0);
        Assertions
                .assertEquals(-1, i);

    }
    @Test
    void test5(){
        int i = MinNum.minNum(6, 5, 0);
        Assertions
                .assertEquals(-1, i);

    }



    @Test
    void test6(){
        int i = MinNum.minNum(6, 5, 1);
        Assertions
                .assertEquals(-1, i);

    }



}