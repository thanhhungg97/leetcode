package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JumpGameTest {
    JumpGame sut = new JumpGame();

    @Test
    void test(){
        boolean b = sut.canJump(new int[]{2, 3, 1, 1, 4});

        assertTrue(b);
    }

    @Test
    void test1(){

        assertFalse(sut.canJump(new int[]{3,2,1,0,4}));
    }


}