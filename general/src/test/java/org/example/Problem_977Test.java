package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_977Test {
    Problem_977 sut = new Problem_977();


    @Test
    void test(){
        int[] ints = sut.sortedSquares(new int[]{-4, -1, 0, 3, 10});
        Assertions.assertArrayEquals(new int[]{0,1,9,16,100}, ints);

    }
    @Test
    void test1(){
        int[] ints = sut.sortedSquares(new int[]{-7,-3,2,3,11});
        Assertions.assertArrayEquals(new int[]{4,9,9,49,121}, ints);

    }

}