package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HouseRobberTest {
    HouseRobber sut =new HouseRobber();



    @Test
    void test(){
        int rob = sut.rob(new int[]{1, 2, 3, 1});

        Assertions.assertEquals(4, rob);
    }

    @Test
    void test1(){
        int rob = sut.rob(new int[]{2,7,9,3,1});

        Assertions.assertEquals(12, rob);
    }


    @Test
    void test2(){
        int rob = sut.rob(new int[]{4,1,2,7,5,3,1});

        Assertions.assertEquals(14, rob);
    }
}