package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForLoopSubSequenceTest {
    IsSubSequence sut = new RecursiveIsSubSequence();
    @Test
    void testcase1(){
        Assertions.assertTrue(sut.isSubsequence("", "abc"));
    }
    @Test
    void testcase2(){
        Assertions.assertTrue(sut.isSubsequence("a", "abc"));
    }
    @Test
    void testcase3(){
        Assertions.assertTrue(sut.isSubsequence("abc", "ahbgdc"));
    }
    @Test
    void testcase4(){
        Assertions.assertFalse(sut.isSubsequence("axc", "ahbgdc"));
    }
}