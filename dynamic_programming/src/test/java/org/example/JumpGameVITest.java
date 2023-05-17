package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameVITest {
    JumpGameVI sut = new JumpGameVI();


    @Test
    void test() {
        int i = sut.maxResultOptimize(new int[]{1, -1, -2, 4, -7, 3}, 2);
        Assertions.assertEquals(7, i);
    }



    @Test
    void test2() {
        int i = sut.maxResultOptimize(new int[]{10, -5, -2, 4, 0, 3}, 3);

        Assertions.assertEquals(17, i);
    }

    @Test
    void test3() {
        int i = sut.maxResultOptimize(new int[]{1,-5,-20,4,-1,3,-6,-3}, 2 );

        Assertions.assertEquals(0, i);
    }

    @Test
    void test4() {
        int i = sut.maxResultOptimize(new int[]{40,30,-100,-100,-10,-7,-3,-3}, 2 );

        Assertions.assertEquals(-40, i);
    }






}