package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatStringTest {
    FormatString sut = new FormatString();


    @Test
    void test(){

        Integer baaabab = sut.format("BAAABAB");

        Assertions.assertEquals(2,baaabab );

    }
    @Test
    void test1(){

        Integer baaabab = sut.format("BBAAABAB");

        Assertions.assertEquals(3,baaabab );

    }
    @Test
    void test2(){

        Integer baaabab = sut.format("BBABAA");

        Assertions.assertEquals(3,baaabab );

    }
    @Test
    void test3(){

        Integer baaabab = sut.format("AAABBBB");

        Assertions.assertEquals(0,baaabab );

    }
    @Test
    void test4(){

        Integer baaabab = sut.format("A");

        Assertions.assertEquals(0,baaabab );

    }
    @Test
    void test5(){

        Integer baaabab = sut.format("B");

        Assertions.assertEquals(0,baaabab );

    }

    @Test
    void test6(){

        Integer baaabab = sut.format("AB");

        Assertions.assertEquals(0,baaabab );

    }
    @Test
    void test7(){

        Integer baaabab = sut.format("BA");

        Assertions.assertEquals(1,baaabab );

    }

    @Test
    void test8(){

        Integer baaabab = sut.format("BAA");

        Assertions.assertEquals(1,baaabab );

    }
    @Test
    void test9(){

        Integer baaabab = sut.format("BBA");

        Assertions.assertEquals(1,baaabab );

    }
    @Test
    void test10(){

        Integer baaabab = sut.format("BBAA");

        Assertions.assertEquals(2,baaabab );

    }
}