package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInRotatedSortedArrayTest {
    SearchInRotatedSortedArray sut = new SearchInRotatedSortedArray();

    @Test
    void testCase1() {
        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        Assertions.assertEquals(4, sut.search(array, 0));
    }

    @Test
    void testPivot1() {
        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        Assertions.assertEquals(3, sut.findPivot(array));
    }

    @Test
    void testPivot2() {
        int[] array = new int[]{4, 5, 6, 0, 1, 2};
        Assertions.assertEquals(2, sut.findPivot(array));
    }

    @Test
    void testPivot3() {
        int[] array = new int[]{4, 5, 0, 1, 2};
        Assertions.assertEquals(1, sut.findPivot(array));
    }

    @Test
    void testPivot4() {
        int[] array = new int[]{4, 0, 1, 2};
        Assertions.assertEquals(0, sut.findPivot(array));
    }

    @Test
    void testCase2() {
        int[] array = new int[]{4, 5, 6, 7, 0, 1, 2};
        Assertions.assertEquals(-1, sut.search(array, 3));
    }

    @Test
    void testCase3() {
        int[] array = new int[]{5, 4};
        Assertions.assertEquals(1, sut.search(array, 4));
    }

    @Test
    void testCase4() {
        int[] array = new int[]{4, 5, 6};
        Assertions.assertEquals(2, sut.search(array, 6));
    }
}