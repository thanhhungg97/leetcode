package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MaximumLevelSumofaBinaryTree {
    static class Wrapper {
        TreeNode root;
        int level;

        public Wrapper(TreeNode root, int level) {
            this.root = root;
            this.level = level;
        }
    }

    public int maxLevelSum(TreeNode root) {
        Queue<Wrapper> queue = new LinkedList<>();
        queue.add(new Wrapper(root, 1));
        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;

        while (!queue.isEmpty()) {
            Wrapper poll = queue.poll();
            if (!map.containsKey(poll.level)) {
                map.put(poll.level, poll.root.val);
            } else {
                Integer integer = map.get(poll.level);
                map.put(poll.level, poll.root.val + integer);
            }
            max = Math.max(max, map.get(poll.level));
            if (poll.root.left != null) {
                queue.add(new Wrapper(poll.root.left, poll.level + 1));
            }

            if (poll.root.right != null) {
                queue.add(new Wrapper(poll.root.right, poll.level + 1));
            }
        }

        return max;
    }
}
