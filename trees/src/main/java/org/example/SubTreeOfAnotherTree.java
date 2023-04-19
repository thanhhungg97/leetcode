package org.example;

public class SubTreeOfAnotherTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if( root == null && subRoot == null){
            return  true;
        }
        if (root == null || root == null) {
            return false;
        }
        if (isEqual(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    boolean isEqual(TreeNode node, TreeNode subTree) {
        if (node == null && subTree == null) {
            return true;
        }
        if (node == null || subTree == null) {
            return false;
        }
        return node.val == subTree.val && isEqual(node.left, subTree.left) && isEqual(node.right, subTree.right);

    }
}
