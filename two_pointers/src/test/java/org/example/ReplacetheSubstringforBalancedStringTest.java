package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplacetheSubstringforBalancedStringTest {
    ReplacetheSubstringforBalancedString sut = new ReplacetheSubstringforBalancedString();


    @Test
    void test() {
        int qwer = sut.balancedString("QWER");

        Assertions.assertEquals(0, qwer );
    }

    @Test
    void test1() {
        int qwer = sut.balancedString("QQWE");

        Assertions.assertEquals(1, qwer);
    }
    @Test
    void test3() {
        int qwer = sut.balancedString("QQQW");
        Assertions.assertEquals(2, qwer);
    }//
    @Test
    void test4() {
        //WWQQRRR RQRQ Q
        // WWQQRRR
        int qwer = sut.balancedString("WWQQRRRRQRQQ");
        Assertions.assertEquals(4, qwer);
    }
    @Test
    void test5() {
        //WWQQRRR RQRQ Q
        // WWQQRRR
        int qwer = sut.balancedString("WWEQERQWQWWRWWERQWEQ");
        Assertions.assertEquals(4, qwer);
    }
}
