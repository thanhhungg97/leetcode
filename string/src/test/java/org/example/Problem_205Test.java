package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_205Test {
    CheckIsmorphic sut = new CheckIsmorphic();


    @Test
    void test(){
        boolean isomorphic = sut.isIsomorphic("egg", "add");
        Assertions.assertTrue(isomorphic);
    }
    @Test
    void test1(){
        boolean isomorphic = sut.isIsomorphic("foo", "bar");
        Assertions.assertFalse(isomorphic);
    }

    @Test
    void test2(){
        boolean isomorphic = sut.isIsomorphic("paper", "title");
        Assertions.assertTrue(isomorphic);
    }

    @Test
    void test3(){
        boolean isomorphic = sut.isIsomorphic("badc", "baba");
        Assertions.assertFalse(isomorphic);
    }
}