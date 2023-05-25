package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GFTTest1Test {
    GFTTest1 test = new GFTTest1();

    @Test
    void test(){
        int naabxxan = test.solution("NAABXXAN");
        Assertions.assertEquals(1, naabxxan);
    }
    @Test
    void test2(){
        int naabxxan = test.solution("NAANAAXNABABYNNBZ");
        Assertions.assertEquals(2, naabxxan);
    }

    @Test
    void test3(){
        int naabxxan = test.solution("QABAAAWOBL");
        Assertions.assertEquals(0, naabxxan);
    }
    @Test
    void test4(){
        int naabxxan = test.solution("BANANA");
        Assertions.assertEquals(1, naabxxan);
    }
}