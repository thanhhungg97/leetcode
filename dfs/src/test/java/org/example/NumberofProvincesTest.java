package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberofProvincesTest {
    NumberofProvinces sut = new NumberofProvinces();

    @Test
    void test(){
        int circleNum = sut.findCircleNum(new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}});

        Assertions.assertEquals(2, circleNum);
    }
    @Test
    void test1(){
        int circleNum = sut.findCircleNum(new int[][]{{1,0,0}, {0,1,0}, {0,0,1}});

        Assertions.assertEquals(3, circleNum);
    }
    @Test
    void test2(){
        int circleNum = sut.findCircleNum(new int[][]{{1,0,0,1}, {0,1,1,0}, {0,1,1,1}, {1,0,1,1}});

        Assertions.assertEquals(1, circleNum);
    }
}