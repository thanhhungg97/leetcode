package org.example.contest.contest105;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumStrengthofaGroupTest {
    MaximumStrengthofaGroup sut = new MaximumStrengthofaGroup();

    @Test
    void test() {
        long l = sut.maxStrength(new int[]{3, -1, -5, 2, 5, -9});

        Assertions.assertEquals(1350, l);
    }

    @Test
    void test1() {
        long l = sut.maxStrength(new int[]{8, 8, -6, -4, -6, -4, -6, -5, 0, -9, -6, -3});

        Assertions.assertEquals(59719680, l);
    }

}