package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_5Test {
    Problem_5 sut = new Problem_5();

    @Test
    void test() {
        String babad = sut.longestPalindrome("babad");
        Assertions.assertEquals("aba", babad);

    }

    @Test
    void test2() {
        String babad = sut.longestPalindrome("cbbd");
        Assertions.assertEquals("bb", babad);

    }
}