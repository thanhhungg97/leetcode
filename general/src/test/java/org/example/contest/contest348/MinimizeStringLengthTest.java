package org.example.contest.contest348;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimizeStringLengthTest {
    MinimizeStringLength sut = new MinimizeStringLength();

    @Test
    void test() {
        int aaabc = sut.minimizedStringLength("aaabc");

        Assertions.assertEquals(3, aaabc);
    }
    @Test
    void test2() {
        int aaabc = sut.minimizedStringLength("cbbd");

        Assertions.assertEquals(3, aaabc);
    }
    @Test
    void test3() {
        int aaabc = sut.minimizedStringLength("dddaaa");

        Assertions.assertEquals(2, aaabc);
    }
    @Test
    void test4() {
        int aaabc = sut.minimizedStringLength("a");

        Assertions.assertEquals(1, aaabc);
    }
    @Test
    void test5() {
        int aaabc = sut.minimizedStringLength("ab");

        Assertions.assertEquals(2, aaabc);
    }
    @Test
    void test6() {
        int aaabc = sut.minimizedStringLength("aabcc");

        Assertions.assertEquals(3, aaabc);
    }


    @Test
    void test7(){
        int aaabc = sut.minimizedStringLength("pip");

        Assertions.assertEquals(2, aaabc);
    }
}