package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class DoubleLinkedListTest {

    @Test
    void testAddLinkNode() {
        DDListNode ddListNode = new DDListNode(12);

        DDListNode ddListNode1 = new DDListNode(13);
        DDListNode ddListNode2 = new DDListNode(15);
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList(ddListNode);
        doubleLinkedList.add(ddListNode1);
        doubleLinkedList.add(ddListNode2);

        List<DDListNode> listNodes = doubleLinkedList.asList();
        Assertions.assertEquals(List.of(ddListNode, ddListNode1, ddListNode2), listNodes);
    }
}