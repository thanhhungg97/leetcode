package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WoodenStickTest {
    WoodenStick woodenStick =  new WoodenStick();

    @Test
    void test(){
        int woodenStick1 = woodenStick.findWoodenStick(10, 21);
        Assertions.assertEquals(7, woodenStick1);
    }
    @Test
    void test1(){
        int woodenStick1 = woodenStick.findWoodenStick(13, 11);
        Assertions.assertEquals(5, woodenStick1);
    }
    @Test
    void test2(){
        int woodenStick1 = woodenStick.findWoodenStick(2, 1);
        Assertions.assertEquals(0, woodenStick1);
    }
    @Test
    void test3(){
        int woodenStick1 = woodenStick.findWoodenStick(1, 8);
        Assertions.assertEquals(2, woodenStick1);
    }
    @Test
    void test4(){
        int woodenStick1 = woodenStick.findWoodenStick(8, 1);
        Assertions.assertEquals(2, woodenStick1);
    }
}