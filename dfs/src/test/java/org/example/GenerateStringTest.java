package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

class GenerateStringTest {
    GenerateString sut = new GenerateString();

    @Test
    void testcase1(){
        List<String> strings = sut.generateString(List.of(1, 2), 3);
        System.out.println(strings);
    }
}