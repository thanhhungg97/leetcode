package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestZigZagPathInABinaryTreeTest {

    LongestZigZagPathInABinaryTree sut = new LongestZigZagPathInABinaryTree();


    @Test
    void test() {
        TreeNode root = new TreeNode(1, null, new TreeNode(1, new TreeNode(1), new TreeNode(1, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1))), new TreeNode(1))));

        int i = sut.longestZigZag(root);

        Assertions.assertEquals(3, i);

    }

    @Test
    void test1() {
        TreeNode root = new TreeNode(1, new TreeNode(1, null, new TreeNode(1, new TreeNode(1, null, new TreeNode(1)), new TreeNode(1))), new TreeNode(1, null, null));

        int i = sut.longestZigZag(root);

        Assertions.assertEquals(4, i);

    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, new TreeNode(1, null, new TreeNode(1, new TreeNode(1, null, new TreeNode(1, null, new TreeNode(1))), new TreeNode(1))), new TreeNode(1));

        int i = sut.longestZigZag(root);

        Assertions.assertEquals(4, i);

    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(1);

        int i = sut.longestZigZag(root);

        Assertions.assertEquals(0, i);
    }
    @Test
    void test4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);

        int i = sut.longestZigZag(root);

        Assertions.assertEquals(1, i);
    }
}