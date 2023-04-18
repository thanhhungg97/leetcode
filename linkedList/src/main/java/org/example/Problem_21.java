package org.example;

/**
 * Merge to sorted linked list
 */
public class Problem_21 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp = new ListNode();
        ListNode cur = tmp;


        while (list1 != null || list2 != null) {
            if (list1 != null && list2 == null) {
                cur.next = list1;
                list1 = list1.next;
            }
            else if (list1 == null && list2 != null) {
                cur.next = list2;
                list2 = list2.next;
            }
            else{
                if (list1.val > list2.val) {
                    cur.next = list2;
                    list2 = list2.next;
                } else {
                    cur.next = list1;
                    list1 = list1.next;
                }
            }
            cur = cur.next;

        }
        return tmp
                .next;
    }

}
