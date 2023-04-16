package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_2116Test {
    Problem_2116 sut = new Problem_2116();

    @Test
    void test1() {
        boolean b = sut.canBeValid("))()))", "010100");
        Assertions.assertEquals(true, b);

    }

    @Test
    void test2() {
        boolean b = sut.canBeValid("()()", "0000");
        Assertions.assertEquals(true, b);

    }
    @Test
    void test3() {
        boolean b = sut.canBeValid("))))", "1100");
        Assertions.assertEquals(false, b);

    }
    @Test
    void test4() {
        boolean b = sut.canBeValid("))", "11");
        Assertions.assertEquals(false, b);
    }
    @Test
    void test5() {
        boolean b = sut.canBeValid("))", "01");
        Assertions.assertEquals(true, b);
    }
    @Test
    void test6() {
        boolean b = sut.canBeValid(")(", "00");
        Assertions.assertEquals(true, b);
    }


    @Test
    void test7() {
        boolean b = sut.canBeValid("))((", "0000");
        Assertions.assertEquals(true, b);
    }
    @Test
    void test9() {
        boolean b = sut.canBeValid("))((", "1100");
        Assertions.assertEquals(false, b);
    }

    @Test
    void test12() {
        boolean b = sut.canBeValid("))((", "0011");
        Assertions.assertEquals(false, b);
    }


    @Test
    void test10() {
        boolean b = sut.canBeValid("))))((", "000000");
        Assertions.assertEquals(true, b);
    }
    @Test
    void test11() {
        boolean b = sut.canBeValid("((()(()()))()((()()))))()((()(()", "10111100100101001110100010001001");
        Assertions.assertEquals(true, b);
    }
}