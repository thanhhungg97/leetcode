package org.example;

public class ValidBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidRoot(root, null, null);
    }

    public boolean isValidRoot(TreeNode root, Integer low, Integer high) {
        if (root == null) {
            return true;
        }
        if (low != null && root.val <= low) {
            return false;
        }
        if (high != null && root.val >= high) {
            return false;
        }
        return isValidRoot(root.left, low, root.val) && isValidRoot(root.right, root.val, high);
    }
}
