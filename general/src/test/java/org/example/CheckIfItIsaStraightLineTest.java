package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfItIsaStraightLineTest {
    CheckIfItIsaStraightLine sut = new CheckIfItIsaStraightLine();
    @Test
    void test(){
        boolean b = sut.checkStraightLine(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}});
        Assertions.assertEquals(true, b);
    }
    @Test
    void test1(){
        boolean b = sut.checkStraightLine(new int[][]{{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}});
        Assertions.assertEquals(false, b);
    }

}