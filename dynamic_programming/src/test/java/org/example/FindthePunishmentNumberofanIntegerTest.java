package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindthePunishmentNumberofanIntegerTest {
    FindthePunishmentNumberofanInteger sut = new FindthePunishmentNumberofanInteger();

    @Test
    void test(){
        int i = sut.punishmentNumber(10);

        Assertions.assertEquals(182, i);


    }
    @Test
    void test1(){
        int i = sut.punishmentNumber(1000);

        Assertions.assertEquals(10804657, i);


    }

}