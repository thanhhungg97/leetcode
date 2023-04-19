package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SortedSumTest {

    SortedSum sut = new SortedSum();


    @Test
    void test(){
        int i = sut.sortedSumOptimize(List.of(9, 5, 8));

        Assertions.assertEquals(80, i);
    }

    @Test
    void test1(){
        int i = sut.sortedSumOptimize(List.of(5, 9));

        Assertions.assertEquals(28, i);
    }
}