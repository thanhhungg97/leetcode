package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class NumberofWaystoReorderArraytoGetSameBST {

    public int numOfWays(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        Tree tree = convertTreeFromArray(list);
        List<Tree> treeNodes = permutation(nums).stream().map(this::convertTreeFromArray).toList();
        return count(tree, treeNodes);

    }


    List<List<Integer>> permutation(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        helper(nums, 0, result, new LinkedList<>());
        return result.stream().toList();
    }

    private void helper(int[] nums, int i, Set<List<Integer>> result, List<Integer> objects) {
        if (i == nums.length) {
            if (!result.contains(objects)) {
                result.add(List.copyOf(objects));
            }
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (!objects.contains(nums[j])) {
                objects.add(nums[j]);
                helper(nums, i + 1, result, objects);
                objects.remove(objects.size() - 1);
            }

        }
    }

    public Tree convertTreeFromArray(List<Integer> nums) {
        Tree tree = new Tree();
        for (Integer item : nums) {
            tree.insert(new TreeNode(item));
        }
        return tree;
    }


    int count(Tree cur, List<Tree> treeNodes) {
        int count = -1;
        for (int i = 0; i < treeNodes.size(); i++) {
            if (cur.compare(treeNodes.get(i))) {
                count++;
            }
        }
        return count;
    }

    public boolean compareTree(Tree treeNode, Tree treeNode1) {
        return treeNode.compare(treeNode1);
    }
}

class Tree {
    TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }

    public Tree() {
        this.root = null;
    }

    void insert(TreeNode node) {
        TreeNode parent = null;
        TreeNode iterator = root;

        while (iterator != null) {
            parent = iterator;
            if (node.val < iterator.val
            ) {
                iterator = iterator.left;
            } else {
                iterator = iterator.right;
            }
        }
        if (parent == null) {
            root = node;
        } else {
            if (node.val < parent.val) {
                parent.left = node;
            } else {
                parent.right = node;
            }
        }

    }

    public boolean compare(Tree other) {
        return compare(this.root, other.root);
    }

    private boolean compare(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) {
            return true;
        }
        if (root == null || root1 == null) {
            return false;
        }
        return compare(root.left, root1.left) && compare(root.right, root1.right);

    }

}
