package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Problem_128Test {
    Problem_128 sut = new Problem_128();


    @Test
    void test() {
        int i = sut.longestConsecutiveBadVersion(new int[]{100, 4, 200, 1, 3, 2});
        Assertions.assertEquals(4, i);
    }

    @Test
    void tes12() {
        int i = sut.longestConsecutiveBadVersion(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});
        Assertions.assertEquals(9, i);
    }


    @Test
    void test3() {

        int i = sut.longestConsecutiveBadVersion(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6});
        Assertions.assertEquals(7, i);
    }
    @Test
    void test4() {

        int i = sut.longestConsecutiveBadVersion(new int[]{1,2,0,1});
        Assertions.assertEquals(3, i);
    }

    @Test
    void test5(){
        int i = sut.longestConsecutiveBadVersion(new int[]{0,1,2,4,8,5,6,7,9,3,55,88,77,99,999999999});
        Assertions.assertEquals(10, i);
    }
}