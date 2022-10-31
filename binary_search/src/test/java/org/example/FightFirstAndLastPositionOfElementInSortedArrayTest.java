package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FightFirstAndLastPositionOfElementInSortedArrayTest {
    FightFirstAndLastPositionOfElementInSortedArray sut = new FightFirstAndLastPositionOfElementInSortedArray();
    @Test
    void testcase1() {
        Assertions.assertArrayEquals(new int[]{3, 4}, sut.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
    }
    @Test
    void testcase2() {
        Assertions.assertArrayEquals(new int[]{-1, -1}, sut.searchRange(new int[]{5,7,7,8,8,10}, 6));
    }
    @Test
    void testcase3() {
        Assertions.assertArrayEquals(new int[]{-1, -1}, sut.searchRange(new int[]{}, 0));
    }
    @Test
    void testcase4() {
        Assertions.assertArrayEquals(new int[]{0, 0}, sut.searchRange(new int[]{1}, 1));
    }
    @Test
    void testcase5() {
        Assertions.assertArrayEquals(new int[]{-1, -1}, sut.searchRange(new int[]{1}, 0));
    }
}