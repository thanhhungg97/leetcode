package org.example;

import java.util.LinkedList;
import java.util.List;

public class PostOrderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();


        traversal(root, result);
        return result;

    }

    private void traversal(TreeNode root, List<Integer> result) {
        if (root != null) {
            traversal(root.left, result);
            traversal(root.right, result);
            result.add(root.val);
        }
    }
}
