package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameTest {
    StoneGame sut = new StoneGame();

    @Test
    void test(){
        boolean b = sut.stoneGame(new int[]{5, 3, 4, 5});

        Assertions.assertEquals(true, b);
    }
    @Test
    void test1(){
        boolean b = sut.stoneGame(new int[]{3,7,2,3});

        Assertions.assertEquals(true, b);
    }
    @Test
    void test2(){
        boolean b = sut.stoneGame(new int[]{106,34,121,158,61,114,199,127,59,181,23,125,100,84,68,39,86,77,166,16,68,36,181,27,156,29,147,162,156,134,70,78,138,114,167,134,60,96,119,4,3,142,12,90,53,2,110,144,175,162,74,87,16,177,61,71,29,67,141,61,174,46,82,116,176,150,88,92,75,1,145,15,58,13,150,78,55,12,35,191,43,55,19,151,178,198,165,40,183,87,124,84,128,177,37,98,177,62,118,38,111,10,89,85,26,21,168,192,121,31,191,48,33});

        Assertions.assertEquals(true, b);
    }

}