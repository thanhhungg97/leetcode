package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesIIITest {

    MaxConsecutiveOnesIII sut = new MaxConsecutiveOnesIII();

    @Test
    void test() {

        int i = sut.longestOnesOptimize(new int[]{1, 1, 0, 1, 0}, 1);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test15() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 0, 1}, 4);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test1() {

        int i = sut.longestOnesOptimize(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}, 2);

        Assertions.assertEquals(6, i);
    }

    @Test
    void test2() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 3);

        Assertions.assertEquals(10, i);
    }

    @Test
    void test3() {

        int i = sut.longestOnesOptimize(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1}, 0);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test4() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 0}, 0);

        Assertions.assertEquals(0, i);
    }

    @Test
    void test5() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 0}, 3);

        Assertions.assertEquals(3, i);
    }

    @Test
    void test6() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 0, 0}, 3);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test7() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 0, 1}, 3);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test8() {

        int i = sut.longestOnesOptimize(new int[]{0, 1, 0, 0}, 2);

        Assertions.assertEquals(3, i);
    }

    @Test
    void test9() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 0, 1}, 2);

        Assertions.assertEquals(4, i);
    }


    @Test
    void test10() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 1, 0, 1}, 1);

        Assertions.assertEquals(3, i);
    }

    @Test
    void test11() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 1, 0, 1}, 2);

        Assertions.assertEquals(5, i);
    }

    @Test
    void test12() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 0, 1, 0, 1}, 2);

        Assertions.assertEquals(4, i);
    }

    @Test
    void test13() {

        int i = sut.longestOnesOptimize(new int[]{1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1}, 8);

        Assertions.assertEquals(25, i);
    }

    @Test
    void test14() {

        int i = sut.longestOnesOptimize(new int[]{0, 0, 0, 1}, 2);

        Assertions.assertEquals(3, i);
    }
}