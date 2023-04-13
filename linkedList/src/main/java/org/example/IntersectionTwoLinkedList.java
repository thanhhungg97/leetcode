package org.example;

import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode tmp1 = headA;

        while (tmp1 != null) {
            set.add(tmp1);
            tmp1 = tmp1.next;
        }
        ListNode tmp2 = headB;
        while (tmp2 != null) {
            if (set.contains(tmp2)) {
                return tmp2;
            }
            tmp2 = tmp2.next;

        }
        return null;
    }

    public ListNode getIntersectionNodeOptimize(ListNode headA, ListNode headB) {
        Integer count1 = count(headA);
        Integer count2 = count(headB);

        if (count1 > count2) {
            int gap = count1 - count2;
            while (gap > 0) {
                gap--;
                headA = headA.next;
            }

        } else {
            int gap = count2 - count1;
            while (gap > 0) {
                gap--;
                headB = headB.next;
            }

        }
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;

    }

    private int count(ListNode headA) {
        ListNode tmp = headA;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }
}
