package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> m = new HashSet<>();
        if (head == null ){
            return null;
        }
        while(!m.contains(head)){
            m.add(head);

            head = head.next;
            if( head == null){
                return null;
            }
        }
        return head;
    }

    /**
     * https://leetcode.com/problems/linked-list-cycle-ii/solutions/1701055/java-c-python-best-explanation-ever-happen-s-for-this-problem/
     * @param head
     * @return
     */

}
