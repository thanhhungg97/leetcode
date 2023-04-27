package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindUniqueBinaryStringTest    {
    FindUniqueBinaryString sut = new FindUniqueBinaryString();


    @Test
    void test(){
        String differentBinaryString = sut
                .findDifferentBinaryOptimize(new String[]{"111", "011", "001"});
        Assertions.assertEquals("000", differentBinaryString);
    }

    @Test
    void test1(){
        String differentBinaryString = sut
                .findDifferentBinaryOptimize(new String[]{"00","01"});
        Assertions.assertEquals("10", differentBinaryString);
    }

}