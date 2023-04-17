package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RotateArrayTest {

    RotateArray sut = new RotateArray();

    @Test
    void test() {
        int[] ints = {1, 2, 3, 4, 5, 6, 7};
        sut.rotate(ints, 3);
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, ints);

    }


}