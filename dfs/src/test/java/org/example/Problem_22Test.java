package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Problem_22Test {
    Problem_22 sut = new Problem_22();


    @Test
    void test1(){
        List<String> strings =
                sut.generateParenthesis(3);

        Assertions.assertEquals(List.of("((()))","(()())","(())()","()(())","()()()"), strings);
    }

    @Test
    void test2(){
        List<String> strings =
                sut.generateParenthesis(1);

        Assertions.assertEquals(List.of("()"), strings);
    }

}