package org.example;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fake = new ListNode();

        fake.next = head;
        ListNode fast = head;

        while (fast != null && n > 0) {
            fast = fast.next;
            n--;
        }

        ListNode slow = fake;
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode next = slow.next;
        if (next != null) {
            slow.next = next.next;
        }

        return fake.next;
    }
}
