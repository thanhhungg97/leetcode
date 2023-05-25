package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GFTTest3Test {
    GFTTest3 test = new GFTTest3();
    @Test
    void test(){
        int solution = test.solution(new String[]{"....X..", "X......", ".....X.", "......."});
        Assertions.assertEquals(15, solution);
    }
    @Test
    void test1(){
        int solution = test.solution(new String[]{"....X..", "X......", ".....X.", "......."});
        Assertions.assertEquals(15, solution);
    }

    @Test
    void test2(){
        int solution = test.solution(new String[]{"."});
        Assertions.assertEquals(1, solution);
    }
    @Test
    void test3(){
        int solution = test.solution(new String[]{});
        Assertions.assertEquals(1, solution);
    }
}