package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    static class TreeNodeExtend {
        TreeNode node;
        Integer dept;

        Integer num;

        public TreeNodeExtend(Integer dept) {
            this.dept = dept;
        }

        public TreeNodeExtend(TreeNode node, Integer dept) {
            this.node = node;
            this.dept = dept;
        }

        public TreeNodeExtend(TreeNode node, Integer num, Integer dept) {
            this.node = node;
            this.dept = dept;
            this.num = num;
        }


        public TreeNodeExtend(TreeNode node) {
            this.node = node;
        }
    }

    public int getHeight(TreeNode root) {
        if (root != null) {
            return 1 + Math.max(getHeight(root.left), getHeight(root.right));
        }
        return 0;
    }

    public int widthOfBinaryTree(TreeNode root) {
        int height = getHeight(root);
        Queue<TreeNodeExtend> queue = new LinkedList<>();

        queue.add(new TreeNodeExtend(root, null, 0));


        HashMap<Integer, List<TreeNode>> tmp = new HashMap<>();
        ArrayList arrayList1 = new ArrayList<>();
        arrayList1.add(root);
        tmp.put(0, arrayList1);
        while (!queue.isEmpty()) {
            TreeNodeExtend poll = queue.poll();
            TreeNode node = poll.node;

            if (tmp.get(poll.dept + 1) == null) {
                ArrayList arrayList = new ArrayList<>();
                if ((node.left == null && poll.dept < height) || node.left != null) {
                    if (node.left == null) {
                        node.left = new TreeNode(Integer.MIN_VALUE);
                    }
                    queue.add(new TreeNodeExtend(node.left, poll.dept + 1));
                    arrayList.add(node.left);
                }


                if ((node.right == null && poll.dept < height) || node.right != null) {
                    if (node.right == null) {
                        node.right = new TreeNode(Integer.MIN_VALUE);
                    }

                    arrayList.add(node.right);
                    queue.add(new TreeNodeExtend(node.right, poll.dept + 1));
                }
                tmp.put(poll.dept + 1, arrayList);
            } else {
                List<TreeNode> treeNodes = tmp.get(poll.dept + 1);
                if ((node.left == null && poll.dept < height) || node.left != null) {
                    if (node.left == null) {
                        node.left = new TreeNode(Integer.MIN_VALUE);
                    }
                    queue.add(new TreeNodeExtend(node.left, poll.dept + 1));
                    treeNodes.add(node.left);

                }
                if ((node.right == null && poll.dept < height) || node.right != null) {
                    if (node.right == null) {
                        node.right = new TreeNode(Integer.MIN_VALUE);
                    }

                    queue.add(new TreeNodeExtend(node.right, poll.dept + 1));
                    treeNodes.add(node.right);

                }

            }
        }
        int max = Integer.MIN_VALUE;
        for (List<TreeNode> value : tmp.values()) {
            int i = 0;
            while (i < value.size() && value.get(i).val == Integer.MIN_VALUE) {
                i++;
            }
            int j = value.size() - 1;

            while (j >= 0 && value.get(j).val == Integer.MIN_VALUE) {
                j--;
            }

            max = Integer.max(max, j - i + 1);
        }

        return max;
    }

    public int widthOfBinaryTreeOptimize(TreeNode root) {
        Queue<TreeNodeExtend> queue = new LinkedList<>();

        queue.add(new TreeNodeExtend(root, 1, 0));
        int result = 0;
        int preNum = 1;
        int preDept = 0;
        while (!queue.isEmpty()) {
            TreeNodeExtend poll = queue.poll();
            if (poll.dept > preDept) {
                preDept = poll.dept;
                preNum = poll.num;
            }
            result = Math.max(result, poll.num - preNum + 1);

            if (poll.node.left != null) {
                queue.add(new TreeNodeExtend(poll.node.left, 2 * poll.num, poll.dept + 1));

            }

            if (poll.node.right != null) {
                queue.add(new TreeNodeExtend(poll.node.right, 2 * poll.num + 1, poll.dept + 1));

            }

        }
        return result;
    }
}
