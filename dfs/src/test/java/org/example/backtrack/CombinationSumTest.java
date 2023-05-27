package org.example.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    CombinationSum sut = new CombinationSum();

    @Test
    void test() {
        List<List<Integer>> lists = sut.combinationSum(new int[]{2, 3, 6, 7}, 7);

        Assertions.assertEquals(List.of(List.of(2, 2, 3), List.of(7)), lists);
    }

}