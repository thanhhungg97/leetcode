package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_1160Test {
    Problem_1160 sut = new Problem_1160();

    @Test
    void test1() {
        int atach = sut.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach");
        Assertions.assertEquals(6, atach);
    }
    @Test
    void test3() {
        int atach = sut.countCharacters(new String[]{"t"}, "atach");

        Assertions.assertEquals(1, atach);
    }


    @Test
    void test2() {
        int atach = sut.countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr");
        Assertions.assertEquals(10, atach);
    }

}