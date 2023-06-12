package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CanMakeArithmeticProgressionFromSequenceTest {
    CanMakeArithmeticProgressionFromSequence sut = new CanMakeArithmeticProgressionFromSequence();

    @Test
    void test(){
        boolean b = sut.canMakeArithmeticProgression(new int[]{3, 5, 1});
        Assertions.assertEquals(true, b);
    }
    @Test
    void test1(){
        boolean b = sut.canMakeArithmeticProgression(new int[]{1, 2, 4});
        Assertions.assertEquals(false, b);
    }

}