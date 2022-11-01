package org.example;

/**
 * 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
 * head
 * tmp = head
 * cur = tmp
 * while cur.value = cur.next.value => cur = cur.next
 * tmp.next = cur;
 * tmp = tmp.next
 */
public class RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {

        return deleteDuplicate(head);
    }
    // Not done

    private ListNode deleteDuplicate(ListNode head) {
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
