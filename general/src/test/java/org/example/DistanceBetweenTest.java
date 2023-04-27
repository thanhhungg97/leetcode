package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DistanceBetweenTest {
    DistanceBetween sut = new DistanceBetween();

    @Test
    void test() {
        int solution = sut.solution(new int[]{2, 6, 8, 5});
        Assertions.assertEquals(3, solution);
    }

    @Test
    void tes1() {
        int solution = sut.solution(new int[]{1, 5, 5, 2, 6});
        Assertions.assertEquals(4, solution);
    }
    @Test
    void tes3() {
        int solution = sut.solution(new int[]{1, 1});
        Assertions.assertEquals(2, solution);
    }
}