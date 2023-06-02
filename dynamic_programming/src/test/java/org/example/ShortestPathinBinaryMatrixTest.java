package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ShortestPathinBinaryMatrixTest {
    ShortestPathinBinaryMatrix sut = new ShortestPathinBinaryMatrix();


    @Test
    void test() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{0, 1}, {1, 0}});

        Assertions.assertEquals(2, i);


    }

    @Test
    void test1() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 0}});

        Assertions.assertEquals(4, i);


    }

    @Test
    void test2() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{1, 0, 0}, {1, 1, 0}, {1, 1, 0}});

        Assertions.assertEquals(-1, i);


    }

    @Test
    void test3() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {1, 1, 0}, {1, 1, 1}});

        Assertions.assertEquals(-1, i);


    }

    @Test
    void test4() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 1, 0}});

        Assertions.assertEquals(3, i);


    }
    @Test
    void test5() {
        int i = sut.shortestPathBinaryMatrix(new int[][]{{0,1,1,0,0,0}, {0,1,0,1,1,0}, {0,1,1,0,1,0},{0,0,0,1,1,0},{1,1,1,1,1,0},{1,1,1,1,1,0}});

        Assertions.assertEquals(14, i);


    }
}