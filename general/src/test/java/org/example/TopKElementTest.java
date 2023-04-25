package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKElementTest {

    TopKElement topKElement = new TopKElement();


    @Test
    void test1() {
        int[] ints = topKElement.topKFrequentOptimize(new int[]{1, 1, 1, 2, 2, 3}, 2);

        Assertions.assertArrayEquals(new int[]{1, 2}, ints);

    }

    @Test
    void test2() {
        int[] ints = topKElement.topKFrequentOptimize(new int[]{1}, 1);

        Assertions.assertArrayEquals(new int[]{1}, ints);

    }

    @Test
    void test4() {
        int[] ints = topKElement.topKFrequentOptimize(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, 1);

        Assertions.assertArrayEquals(new int[]{2}, ints);

    }

}