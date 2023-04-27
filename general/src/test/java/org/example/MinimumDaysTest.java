package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumDaysTest {
    MinimumDays sut = new MinimumDays();


    @Test
    void test() {
        int minimum = sut.getMinimumOptimize(new int[]{5, 8, 2, 7}, 3);
        Assertions.assertEquals(3, minimum);
    }

    @Test
    void test1() {
        int minimum = sut.getMinimumOptimize(new int[]{2, 5, 9, 2, 1, 4}, 4);
        Assertions.assertEquals(3, minimum);
    }

    @Test
    void test6() {
        int minimum = sut.getMinimumOptimize(new int[]{1, 12, 10, 4, 5, 2}, 2);
        Assertions.assertEquals(4, minimum);
    }

    @Test
    void test3() {
        int minimum = sut.getMinimumOptimize(new int[]{2}, 2);
        Assertions.assertEquals(1, minimum);
    }

    @Test
    void test4() {
        int minimum = sut.getMinimumOptimize(new int[]{2, 5, 9}, 2);
        Assertions.assertEquals(3, minimum);
    }

    @Test
    void test5() {
        int minimum = sut.getMinimumOptimize(new int[]{2, 5, 9}, 3);
        Assertions.assertEquals(2, minimum);
    }
    @Test
    void test7() {
        int minimum = sut.getMinimumOptimize(new int[]{},0  );
        Assertions.assertEquals(0, minimum);
    }
    @Test
    void test8() {
        int minimum = sut.getMinimumOptimize(new int[]{1},0  );
        Assertions.assertEquals(0, minimum);
    }
}