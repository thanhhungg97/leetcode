package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualRowandColumnPairsTest {
    EqualRowandColumnPairs sut = new EqualRowandColumnPairs();

    @Test
    void test() {
        int i = sut.equalPairsOptimize(new int[][]{{3, 2, 1}, {1, 7, 6}, {2, 7, 7}});
        Assertions.assertEquals(1, i);
    }

    @Test
    void test1() {
        int i = sut.equalPairsOptimize(new int[][]{{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}});
        Assertions.assertEquals(3, i);
    }
}