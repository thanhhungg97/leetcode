package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximizeDistancetoClosestPersonTest {
    MaximizeDistancetoClosestPerson sut = new MaximizeDistancetoClosestPerson();


    @Test
    void test1() {
        int i = sut.maxDistToClosestOptimize(new int[]{1, 0, 0, 0, 1, 0,});
        Assertions.assertEquals(2, i);
    }

    @Test
    void test2() {
        int i = sut.maxDistToClosestOptimize(new int[]{1, 0, 0, 0});
        Assertions.assertEquals(3, i);
    }

    @Test
    void test3() {
        int i = sut.maxDistToClosestOptimize(new int[]{0, 1});
        Assertions.assertEquals(1, i);
    }

}