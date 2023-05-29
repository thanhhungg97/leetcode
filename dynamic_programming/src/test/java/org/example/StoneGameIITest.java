package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneGameIITest {

    @Test
    void test() {
        StoneGameII sut = new StoneGameII();

        int i = sut.stoneGameII(new int[]{2, 7, 9, 4, 4});

        Assertions.assertEquals(10, i);
    }

    @Test
    void test1() {
        StoneGameII sut = new StoneGameII();

        int i = sut.stoneGameII(new int[]{1});

        Assertions.assertEquals(1, i);
    }

}