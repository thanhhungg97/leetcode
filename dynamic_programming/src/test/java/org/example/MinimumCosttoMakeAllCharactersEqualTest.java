package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumCosttoMakeAllCharactersEqualTest {
    MinimumCosttoMakeAllCharactersEqual sut = new MinimumCosttoMakeAllCharactersEqual();

    @Test
    void test() {
        long l = sut.minimumCost("0011");
        Assertions.assertEquals(2, l);
    }

    @Test
    void test1() {
        long l = sut.minimumCost("010101");
        Assertions.assertEquals(9, l);
    }
}