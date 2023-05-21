package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumStringLengthAfterRemovingSubstringsTest {

    MinimumStringLengthAfterRemovingSubstrings sut = new MinimumStringLengthAfterRemovingSubstrings();

    @Test
    void test(){
        int abfcacdb = sut.minLength("ABFCACDB");
        Assertions.assertEquals(2, abfcacdb);

    }
    @Test
    void test1(){
        int abfcacdb = sut.minLength("ACBBD");
        Assertions.assertEquals(5, abfcacdb);

    }
}