package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_5Test {
    LongestPalindrome sut = new LongestPalindrome();

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