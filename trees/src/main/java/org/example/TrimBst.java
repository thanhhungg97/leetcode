package org.example;

public class TrimBst {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            root.left = null;
            return trimBST(root.right, low, high);
        } else if (root.val > high) {
            root.right = null;
            return trimBST(root.left, low, high);
        } else {
            root.left = trimBST(root.left, low, high);
            root.right = trimBST(root.right, low, high);
        }

        return root;
    }


}
