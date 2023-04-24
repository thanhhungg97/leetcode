package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FixRoadTest {
    FixRoad fixRoad = new FixRoad();

    @Test
    void test() {
        int i = fixRoad.fixRoad("...xxx..x...xxx.", 7);

        Assertions.assertEquals(5, i);
    }

    @Test
    void tes1() {
        int i = fixRoad.fixRoad("..xxxxxx", 4);

        Assertions.assertEquals(3, i);
    }

    @Test
    void tes4() {
        int i = fixRoad.fixRoad("..x", 1);

        Assertions.assertEquals(0, i);
    }

    @Test
    void tes5() {
        int i = fixRoad.fixRoad("..x", 2);

        Assertions.assertEquals(1, i);
    }
    @Test
    void tes2() {
        int i = fixRoad.fixRoad("x.x.xxx...X", 14);

        Assertions.assertEquals(6, i);
    }
    @Test
    void tes6() {
        int i = fixRoad.fixRoad("..x.xxx..xxxxx",6 );

        Assertions.assertEquals(5, i);
    }
    @Test
    void tes7() {
        int i = fixRoad.fixRoad("..x.xxx..xxxxx",8 );

        Assertions.assertEquals(6, i);
    }



    @Test
    void tes3() {
        int i = fixRoad.fixRoad(".", 5);

        Assertions.assertEquals(0, i);
    }

}