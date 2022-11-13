package org.example;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        return helper(head, null);

    }

    ListNode helper(ListNode head, ListNode prev) {
        if (head == null) {
            return prev;
        }
        ListNode next = head.next;
        head.next = prev;
       return helper(next, head);
    }

}
