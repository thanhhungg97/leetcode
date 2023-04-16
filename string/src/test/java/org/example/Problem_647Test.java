package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem_647Test {
    Problem_647 sut = new Problem_647();


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