package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimetoBuyandSellStockTest {

    BestTimetoBuyandSellStock sut = new BestTimetoBuyandSellStock();


    @Test
    void test(){
        int i = sut
                .maxProfitOptimize(new int[]{7, 1, 5, 3, 6, 4});

        Assertions.assertEquals(5, i);

    }
    @Test
    void test1(){
        int i = sut
                .maxProfitOptimize(new int[]{7,6,4,3,1});

        Assertions.assertEquals(0, i);

    }

}