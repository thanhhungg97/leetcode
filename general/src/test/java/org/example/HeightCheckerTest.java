package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HeightCheckerTest {
    HeightChecker sut = new HeightChecker();
    @Test
    void test(){

        int i = sut.heightChecker(new int[]{1, 1, 4, 2, 1, 3});
        Assertions.assertEquals(3, i);

    }
    @Test
    void test1(){

        int i = sut.heightChecker(new int[]{5,1,2,3,4});
        Assertions.assertEquals(5, i);

    }


}