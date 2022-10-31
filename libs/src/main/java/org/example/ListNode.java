package org.example;

import java.util.Iterator;
import java.util.Objects;

public class ListNode implements Iterable<ListNode> {
    int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    public static ListNode fromArray(int[] arr) {
        ListNode head = new ListNode();
        ListNode tmp = head;
        for (int i = 0; i < arr.length; i++) {
            tmp.next = new ListNode(arr[i]);
            tmp = tmp.next;
        }
        return head.next;
    }

    public static class ListNodeIterator implements Iterator<ListNode> {
        private ListNode listNode;

        ListNodeIterator(ListNode listNode) {
            ListNode head = new ListNode();
            head.next = listNode;
            this.listNode = head;
        }

        public boolean hasNext() {
            return listNode.next != null;
        }

        public ListNode next() {
            ListNode next = listNode.next;
            this.listNode = next;
            return next;
        }
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");

        }
    }

    public Iterator<ListNode> iterator() {
        return new ListNodeIterator(this);
    }
}
