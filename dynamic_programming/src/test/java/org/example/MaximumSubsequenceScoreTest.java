package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubsequenceScoreTest {

    MaximumSubsequenceScore sut = new MaximumSubsequenceScore();

    @Test
    void test() {
        long l = sut.
                maxScore(new int[]{1, 3, 3, 2}, new int[]{2, 1, 3, 4}, 3);

        Assertions.assertEquals(12, l);
    }

    @Test
    void test1() {
        long l = sut.
                maxScore(new int[]{4, 2, 3, 1, 1}, new int[]{7, 5, 10, 9, 6}, 1);

        Assertions.assertEquals(30, l);
    }

}