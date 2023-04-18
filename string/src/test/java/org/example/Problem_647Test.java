package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_647Test {
    CountSubString sut = new CountSubString();


    @Test
    void test1(){
        int abc = sut.countSubstringsOptimize("abc");
        Assertions.assertEquals(3, abc);
    }
    @Test
    void test2(){
        int abc = sut.countSubstringsOptimize("aaa");
        Assertions.assertEquals(6, abc);
    }

}