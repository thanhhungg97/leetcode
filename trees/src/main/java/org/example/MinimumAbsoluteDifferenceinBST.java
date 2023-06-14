package org.example;

import java.util.LinkedList;
import java.util.List;

public class MinimumAbsoluteDifferenceinBST {
    public int getMinimumDifference(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preOrderTravel(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return min;
    }

    private void preOrderTravel(TreeNode root, List<Integer> list) {
        if (root != null) {
            preOrderTravel(root.left, list);
            preOrderTravel(root.right, list);
            list.add(root.val);
        }

    }


}
