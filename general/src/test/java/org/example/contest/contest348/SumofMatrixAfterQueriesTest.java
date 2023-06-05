package org.example.contest.contest348;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumofMatrixAfterQueriesTest {

    SumofMatrixAfterQueries sut = new SumofMatrixAfterQueries();

    @Test
    void test() {
        long l = sut.matrixSumQueries(3, new int[][]{{0, 0, 1}, {1, 2, 2}, {0, 2, 3}, {1, 0, 4}});

        Assertions.assertEquals(23, l);

    }
    @Test
    void test1() {
        long l = sut.matrixSumQueries(3, new int[][]{{0,0,4}, {0,1,2}, {1,0,1}, {0,2,3}, {1,2,1}});

        Assertions.assertEquals(17, l);

    }
}