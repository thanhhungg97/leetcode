package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumWidthOfBinaryTreeTest {

    MaximumWidthOfBinaryTree sut = new MaximumWidthOfBinaryTree();


    @Test
    void test() {
        int i = sut.widthOfBinaryTreeOptimize(new TreeNode(
                1, new TreeNode(
                3,
                new TreeNode(5),
                new TreeNode(3)

        ), new TreeNode(2, null, new TreeNode(9))
        ));

        Assertions.assertEquals(4, i);

    }

    @Test
    void test1() {
        int i = sut.widthOfBinaryTreeOptimize(
                new TreeNode(
                        1,
                        new TreeNode(3,
                                new TreeNode(
                                        5
                                        , new TreeNode(6)
                                        , null
                                ), null),
                        new TreeNode(2, null,
                                new TreeNode(9,
                                        new TreeNode(7), null))
                ));

        Assertions.assertEquals(7, i);

    }

}