package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BackspaceStringCompareTest
{
    BackspaceStringCompare sut = new BackspaceStringCompare();


    @Test
    void test(){

        boolean b = sut.backspaceCompare("ab#c", "ad#c");

        Assertions.assertTrue(b);
    }

    @Test
    void test1(){

        boolean b = sut.backspaceCompare("ab##", "c#d#");

        Assertions.assertTrue(b);
    }
    @Test
    void test3(){

        boolean b = sut.backspaceCompare("cab##", "dc#d#");

        Assertions.assertFalse(b);
    }
    @Test
    void test4(){

        boolean b = sut.backspaceCompare("aab##", "ac#d#");

        Assertions.assertTrue(b);
    }
    @Test
    void test5(){

        boolean b = sut.backspaceCompare("###", "###");

        Assertions.assertTrue(b);
    }

    @Test
    void test6(){

        boolean b = sut.backspaceCompare("a###", "a###");

        Assertions.assertTrue(b);
    }
    @Test
    void test8(){

        boolean b = sut.backspaceCompare("#a###", "#a###");

        Assertions.assertTrue(b);
    }
    @Test
    void test9(){

        boolean b = sut.backspaceCompare("#b###", "#a###");

        Assertions.assertTrue(b);
    }
    @Test
    void test10(){

        boolean b = sut.backspaceCompare("ddab###", "ddab###");

        Assertions.assertTrue(b);
    }
    @Test
    void test2(){

        boolean b = sut.backspaceCompare("a#c", "b");

        Assertions.assertFalse(b);
    }

    @Test
    void test11(){

        boolean b = sut.backspaceCompare("bxj##tw", "bxo#j##tw");

        Assertions.assertTrue(b);
    }
    @Test
    void test12(){

        boolean b = sut.backspaceCompare("bxj##tw", "bxj###tw");

        Assertions.assertFalse(b);
    }
}