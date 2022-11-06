package org.example;

/**
 * Using sentinel head to handle case the head will delete
 * 9 -> 9 -> 9 -> null
 * The primary purpose is to standarlize the situation to avoid edge case handling.
 * Using predecessor to keep track the last value after we the duplicated.
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        return deleteDuplicate(head);
    }
    // Not done


    private ListNode deleteDuplicate(ListNode head) {
        ListNode sentinel = new ListNode(-1, head);
        ListNode pre = sentinel;

        while (head != null) {
            if (head.next != null && head.next.val == head.val) {
                while (head.next != null && head.next.val == head.val) {
                    head = head.next;
                }
                pre.next = head.next;
            } else {
                pre = pre.next;
            }
            head = head.next;
        }
        return sentinel.next;
    }
}
