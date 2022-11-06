package org.example;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode tmp = head;
        while (tmp != null) {
            ListNode cur = tmp;
            while (cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
            }
            tmp.next = cur.next;
            tmp = tmp.next;
        }
        return head;
    }
}
