package org.example;

import java.util.LinkedList;
import java.util.List;

public class DoubleLinkedList implements IDoubleLinkedList {
    private DDListNode head;
    private DDListNode tail;

    DoubleLinkedList(DDListNode node) {
        this.head = node;
        this.tail = node;

    }

    @Override
    public void add(DDListNode listNode) {
        tail.next = listNode;
        listNode.pre = tail;
        tail = listNode;
    }

    @Override
    public void remove(DDListNode listNode) {

    }

    public DDListNode getHead() {
        return head;
    }

    public List<DDListNode> asList() {
        DDListNode tmp = head;

        List<DDListNode> listNodes = new LinkedList<>();
        while (tmp != null) {
            listNodes.add(tmp);
            tmp = tmp.next;
        }
        return listNodes;
    }
}

