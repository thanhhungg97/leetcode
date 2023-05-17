package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumErasureValueTest {
    MaximumErasureValue sut = new MaximumErasureValue();


    @Test
    void test(){
        int i = sut.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6});
        Assertions.assertEquals(17, i);
    }

    @Test
    void test1(){
        int i = sut.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5});
        Assertions.assertEquals(8, i);
    }
}