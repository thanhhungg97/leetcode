package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PerformTaskTest {
    PerformTask sut = new PerformTask();

    @Test
    void test(){
        int perform = sut.perform("><^v");
        Assertions.assertEquals(2, perform);
    }
    @Test
    void test1(){
        int perform = sut.perform("<<^v<>>");
        Assertions.assertEquals(6, perform);
    }
}