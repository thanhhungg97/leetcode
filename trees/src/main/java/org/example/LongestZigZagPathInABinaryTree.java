package org.example;

public class LongestZigZagPathInABinaryTree {
    int pathLength = 0;

    public int longestZigZag(TreeNode root) {

        traverse(root, true, 0);
        traverse(root, false, 0);

        return pathLength;
    }


    private void traverse(TreeNode node, boolean isLeft, int curPath) {
        if (node != null) {
            pathLength = Math.max(curPath, pathLength);
            traverse(node.right, false, isLeft ? curPath + 1 : 1);
            traverse(node.left, true, isLeft ? 1 : curPath + 1);
        }
    }

}
