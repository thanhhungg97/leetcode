package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasStationTest {
    GasStation sut =new GasStation();
    @Test
    void test(){
        int i = sut
                .canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2});
        Assertions.assertEquals(3, i);

    }
    @Test
    void test1(){
        int i = sut
                .canCompleteCircuit(new int[]{2,3 ,4}, new int[]{3,4,3});
        Assertions.assertEquals(-1, i);

    }
    @Test
    void test2(){
        int i = sut
                .canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1});
        Assertions.assertEquals(4, i);

    }
    @Test
    void test3(){
        int i = sut
                .canCompleteCircuit(new int[]{4,5,3,1,4}, new int[]{5,4,3,4,2});
        Assertions.assertEquals(-1, i);

    }


}