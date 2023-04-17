package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class Problem_46Test {
    Problem_46 sut = new Problem_46();


    @Test
    void test1() {
        List<List<Integer>> permute =
                sut.permute(new int[]{1, 2, 3});

        Assertions.assertEquals(List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        ), permute);

    }

}