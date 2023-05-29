package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThirdMaximumNumberTest {
    ThirdMaximumNumber sut = new ThirdMaximumNumber();

    @Test
    void test() {
        int i = sut
                .thirdMax(new int[]{3, 2, 1});

        Assertions.assertEquals(1, i);
    }

    @Test
    void test1() {
        int i = sut
                .thirdMax(new int[]{1, 2});

        Assertions.assertEquals(2, i);
    }

    @Test
    void test3() {
        int i = sut
                .thirdMax(new int[]{2, 2, 3, 1});

        Assertions.assertEquals(1, i);
    }

    @Test
    void test4() {
        int i = sut
                .thirdMax(new int[]{2, 2, 3});

        Assertions.assertEquals(3, i);
    }

    //1,2,2,5,3,5

    @Test
    void test5() {
        int i = sut
                .thirdMax(new int[]{1,2,2,5,3,5});

        Assertions.assertEquals(2, i);
    }
}