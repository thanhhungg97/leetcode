package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JumpGameIITest {
    JumpGameII sut = new JumpGameII();

    @Test
    void test(){
        int jump = sut.jumpOptimize(new int[]{2, 3, 0, 1, 4});
        Assertions.assertEquals(2, jump);
    }
    @Test
    void test2(){
        int jump = sut.jumpOptimize(new int[]{2,3,1,1,4});
        Assertions.assertEquals(2, jump);
    }
}