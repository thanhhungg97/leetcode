package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class FindAllAnagramInStringTest {
    FindAllAnagramInString sut = new FindAllAnagramInString();

    @Test
    void testcase1() {
        List<Integer> anagrams = sut.findAnagrams("ab", "abab" );
        Assertions.assertTrue(List.of(0, 1, 2).equals(anagrams));
    }
    @Test
    void testcase3() {
        List<Integer> anagrams = sut.findAnagrams("a", "a" );
        Assertions.assertTrue(List.of(0).equals(anagrams));
    }
    @Test
    void testcase4() {
        List<Integer> anagrams = sut.findAnagrams("a", "aa" );
        Assertions.assertTrue(List.of(0, 1).equals(anagrams));
    }
    @Test
    void testcase2() {
        List<Integer> anagrams = sut.findAnagrams("abc", "cbaebabacd" );
        Assertions.assertTrue(List.of(0, 6).equals(anagrams));
    }
}