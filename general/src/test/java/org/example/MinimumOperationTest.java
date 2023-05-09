package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationTest {

    @Test
    void test() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(3, 4, 1, 7, 6), 4, 2);
        Assertions.assertEquals(3, minimumOperations);
    }

    @Test
    void test1() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(3, 3, 6, 9), 3, 2);
        Assertions.assertEquals(3, minimumOperations);
    }

    @Test
    void test2() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(3), 3, 2);
        Assertions.assertEquals(1, minimumOperations);
    }

    @Test
    void test3() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(4), 3, 2);
        Assertions.assertEquals(2, minimumOperations);
    }

    @Test
    void test4() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(4, 4), 3, 2);
        Assertions.assertEquals(2, minimumOperations);
    }

    @Test
    void test5() {
        int minimumOperations = MinimumOperation.getMinimumOperations(List.of(4, 4), 2, 1);
        Assertions.assertEquals(3, minimumOperations);
    }
}