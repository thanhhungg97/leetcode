package org.example.contest.contest105;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExtraCharactersinaStringTest {

    ExtraCharactersinaString sut = new ExtraCharactersinaString();


    @Test
    void test() {

        int leetscode = sut.minExtraChar("leetscode", new String[]{"leet", "code", "leetcode"});

        Assertions.assertEquals(1, leetscode);
    }

    @Test
    void test2() {

        int leetscode = sut.minExtraChar("dwmodizxvvbosxxw", new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"});

        Assertions.assertEquals(7, leetscode);
    }

    @Test
    void test1() {

        int leetscode = sut.minExtraChar("sayhelloworld", new String[]{"hello", "world"});

        Assertions.assertEquals(3, leetscode);
    }

    @Test
    void test3() {

        int leetscode = sut.minExtraChar("octncmdbgnxapjoqlofuzypthlytkmchayflwky", new String[]{"m", "its", "imaby", "pa", "ijmnvj", "k", "mhka", "n", "y", "nc", "wq", "p", "mjqqa", "ht", "dfoa", "yqa", "kk", "pixq", "ixsdln", "rh", "dwl", "dbgnxa", "kmpfz", "nhxjm", "wg", "wky", "oct", "og", "uhin", "zxb", "qz", "tpf", "hlrc", "j", "l", "tew", "xbn", "a", "uzypt", "uvln", "mchay", "onnbi", "hlytk", "pjoqlo", "dxsjr", "u", "uj"});

        Assertions.assertEquals(2, leetscode);
    }
}