package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindPeakElementTest {
    FindPeakElement sut = new FindPeakElement();

    @Test
    void testcase1() {
        Assertions.assertEquals(2, sut.findPeakElement(new int[]{1, 2, 3, 1}));

    }
    @Test
    void testcase2() {
        Assertions.assertEquals(5, sut.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4}));
    }

    @Test
    void testcase3() {
        Assertions.assertEquals(0, sut.findPeakElement(new int[]{1}));
    }
    @Test
    void testcase4() {
        Assertions.assertEquals(1, sut.findPeakElement(new int[]{1, 2}));
    }
    @Test
    void testcase5() {
        Assertions.assertEquals(0, sut.findPeakElement(new int[]{2, 1}));
    }
    @Test
    void testcase6() {
        Assertions.assertEquals(3, sut.findPeakElement(new int[]{1, 2, 3, 4}));
    }
    @Test
    void testcase7() {
        Assertions.assertEquals(0, sut.findPeakElement(new int[]{4, 3, 2, 1}));
    }
}