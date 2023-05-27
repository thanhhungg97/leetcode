package org.example.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class CombinationSumIITest {

    CombinationSumII sut = new CombinationSumII();


    @Test
    void test() {
        List<List<Integer>> lists = sut.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
        Assertions.assertEquals(List.of(List.of(1, 1, 6), List.of(1, 2, 5), List.of(1, 7), List.of(2, 6)), lists);
    }

}