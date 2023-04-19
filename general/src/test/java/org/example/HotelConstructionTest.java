package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HotelConstructionTest {


    @Test
    void test() {
        int i = HotelConstruction.numberOfWays(List.of(List.of(1, 2), List.of(2, 5), List.of(3, 4), List.of(4, 5), List.of(5, 6), List.of(7, 6)));
        Assertions.assertEquals(2, i);
    }

}