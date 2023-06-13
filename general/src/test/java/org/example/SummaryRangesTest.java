package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {
    SummaryRanges sut = new SummaryRanges();

    @Test
    void test() {
        List<String> strings = sut.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        Assertions.assertEquals(List.of("0->2", "4->5", "7"), strings);
    }

    @Test
    void test1() {
        List<String> strings = sut.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9});

        Assertions.assertEquals(List.of("0", "2->4", "6", "8->9"), strings);
    }

    @Test
    void test2() {
        List<String> strings = sut.summaryRanges(new int[]{0});

        Assertions.assertEquals(List.of("0"), strings);
    }

    @Test
    void test3() {
        List<String> strings = sut.summaryRanges(new int[]{0, 2});

        Assertions.assertEquals(List.of("0", "2"), strings);
    }

    @Test
    void test4() {
        List<String> strings = sut.summaryRanges(new int[]{0, 1});

        Assertions.assertEquals(List.of("0->1"), strings);
    }
    @Test
    void test5() {
        List<String> strings = sut.summaryRanges(new int[]{0, 2, 3});

        Assertions.assertEquals(List.of("0", "2->3"), strings);
    }
}