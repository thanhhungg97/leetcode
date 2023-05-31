package org.example.backtrack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIIITest {

    CombinationSumIII sut = new CombinationSumIII();

    @Test
    void test(){
        List<List<Integer>> lists = sut.combinationSum3(3, 7);
        Assertions.assertEquals(List.of(List.of(1, 2, 4)), lists);
    }

    @Test
    void test1(){
        List<List<Integer>> lists = sut.combinationSum3(3, 9);
        Assertions.assertEquals(List.of(List.of(1, 2, 6), List.of(1, 3 ,5), List.of(2, 3, 4)), lists);
    }


}