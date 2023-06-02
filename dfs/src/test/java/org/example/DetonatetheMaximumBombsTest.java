package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetonatetheMaximumBombsTest {
    DetonatetheMaximumBombs sut = new DetonatetheMaximumBombs();

    @Test
    void test() {
        int i = sut.maximumDetonation(new int[][]{{2, 1, 3}, {6, 1, 4}});
        Assertions.assertEquals(2, i);
    }

    @Test
    void test1() {
        int i = sut.maximumDetonation(new int[][]{{1, 1, 5}, {10, 10, 5}});
        Assertions.assertEquals(1, i);
    }

    @Test
    void test2() {
        int i = sut.maximumDetonation(new int[][]{{1, 2, 3}, {2, 3, 1}, {3, 4, 2}, {4, 5, 3}, {5, 6, 4}});
        Assertions.assertEquals(5, i);
    }
    @Test
    void test3() {
        int i = sut.maximumDetonation(new int[][]{{85024,58997,3532}, {65196,42043,9739}, {85872,75029,3117}, {73014,91183,7092}, {29098,40864,7624}, {11469,13607,4315},
                {98722,69681,9656}, {75140,42250,421}, {92580,44040,4779}, {58474,78273,1047}, {27683,4203,6186},{10714,24238,6243},{60138,81791,3496}, {16227,92418,5622},
                {60496,64917,2463}, {59241,62074,885}, {11961,163,5815}, {37757,43214,3402}, {21094,98519,1678}, { 49368,22385,1431},{6343,53798,159}, {80129,9282,5139},
                {69565,32036,6827}, {59372,64978,6575}, {44948,71199,7095}, {46390,91701,1667}, {37144,98691,8128}, {13558,81505,4653}, {41234,48161,9304}, {14852,3206,5369}
        });
        Assertions.assertEquals(3, i);
    }


}