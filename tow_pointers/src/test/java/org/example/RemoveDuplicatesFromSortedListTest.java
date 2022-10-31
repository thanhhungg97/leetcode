package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveDuplicatesFromSortedListTest {
    RemoveDuplicatesFromSortedList sut = new RemoveDuplicatesFromSortedList();

    @Test
    void testcase1() {
        Assertions.assertTrue(ListNode.fromArray(new int[]{1, 2, 5}).equals(sut.deleteDuplicates(ListNode.fromArray(new int[]{1, 2, 3, 3, 4, 4, 5}))));
    }
}