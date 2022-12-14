package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class AGraphContainLoopTest {
    ATreeHerachiContainLoop sut = new ATreeHerachiContainLoop();

    @Test
    void testcase1() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);

        treeNode.setChills(List.of(treeNode1, treeNode2));
        treeNode2.setChills(List.of(treeNode3));
        treeNode3.setChills(List.of(treeNode2));
        treeNode1.setChills(List.of());
        Assertions.assertTrue(sut.verifyLoop(treeNode));
    }

    @Test
    void testcase2() {
        TreeNode treeNode = new TreeNode(1);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(3);
        TreeNode treeNode3 = new TreeNode(4);

        treeNode.setChills(List.of(treeNode1, treeNode2));
        treeNode2.setChills(List.of(treeNode3));
        treeNode1.setChills(List.of());
        treeNode3.setChills(List.of());
        Assertions.assertFalse(sut.verifyLoop(treeNode));
    }

    @Test
    void testcase3() {
        Map<Integer , Integer > m = new HashMap<>();
        m.put(1, 2);
        m.put(2, 3);

        Assertions.assertFalse(sut.dfsWithHashMap(m));
    }
}