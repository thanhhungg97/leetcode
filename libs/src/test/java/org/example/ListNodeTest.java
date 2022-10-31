package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

class ListNodeTest {
    @Test
    void testcase1() {
        int[] arr = new int[]{1, 1, 1, 2, 3};
        validate(arr);
    }

    @Test
    void testcase2() {
        int[] arr = new int[]{1, 1, 1};
        validate(arr);
    }



    @Test
    void testcase4() {
        int[] arr = new int[]{1};
        validate(arr);
    }

    @Test
    void testcase5() {
        int[] arr = new int[]{1, 1};
        validate(arr);
    }

    public void validate(int[] arr) {
        Iterator<ListNode> iterator = ListNode.fromArray(arr).iterator();
        int count = 0;
        while (iterator.hasNext()) {
            ListNode next = iterator.next();
            Assertions.assertEquals(next.val, arr[count]);
            count++;
        }
    }
}