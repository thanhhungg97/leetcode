package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeNeededtoInformAllEmployeesTest{
    TimeNeededtoInformAllEmployees sut = new TimeNeededtoInformAllEmployees();


    @Test
    void test(){
        int i = sut.numOfMinutes(1, 0, new int[]{-1}, new int[]{0});
        Assertions.assertEquals(0, i);
    }

    @Test
    void test1(){
        int i = sut.numOfMinutes(6, 2, new int[]{2, 2, -1, 2, 2, 2}, new int[]{0, 0, 1, 0, 0, 0});

        Assertions.assertEquals(1, i);
    }

    @Test
    void test2(){
        int i = sut.numOfMinutes(15, 0, new int[]{-1,0,0,1,1,2,2,3,3,4,4,5,5,6,6}, new int[]{1,1,1,1,1,1,1,0,0,0,0,0,0,0,0});

        Assertions.assertEquals(3, i);
    }

}