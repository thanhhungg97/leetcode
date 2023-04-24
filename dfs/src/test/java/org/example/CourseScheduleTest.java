package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CourseScheduleTest {

    CourseSchedule sut = new CourseSchedule();


    @Test
    void test() {
        boolean b = sut
                .canFinish(2, new int[][]{new int[]{0, 1}});

        Assertions.assertTrue(b);
    }

    @Test
    void test1() {
        boolean b = sut
                .canFinish(2, new int[][]{new int[]{0, 1}, new int[]{1, 0}});

        Assertions.assertFalse(b);
    }
}