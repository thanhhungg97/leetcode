package org.example.contest.contest348;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SemiOrderedPermutationTest {
    SemiOrderedPermutation sut = new SemiOrderedPermutation();

    @Test
    void test() {
        int i = sut.semiOrderedPermutation(new int[]{2, 1, 4, 3});
        Assertions.assertEquals(2, i);
    }
    @Test
    void test1() {
        int i = sut.semiOrderedPermutation(new int[]{2,4,1,3});
        Assertions.assertEquals(3, i);
    }
    @Test
    void test2() {
        int i = sut.semiOrderedPermutation(new int[]{1,3,4,2,5});
        Assertions.assertEquals(0, i);
    }
    @Test
    void test3() {
        int i = sut.semiOrderedPermutation(new int[]{1});
        Assertions.assertEquals(0, i);
    }

    @Test
    void test5() {
        int i = sut.semiOrderedPermutation(new int[]{2,1});
        Assertions.assertEquals(1, i);}



}