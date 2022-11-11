package org.example;


import java.util.*;

class TreeNode {
    Integer value;

    TreeNode(Integer value) {
        this.value = value;
    }

    List<TreeNode> chills;

    public void setChills(List<TreeNode> chills) {
        this.chills = chills;
    }

    public List<TreeNode> getChills() {
        return chills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return Objects.equals(value, treeNode.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public class ATreeHerachiContainLoop {
    public boolean verifyLoop(TreeNode treeNode) {
        return dfsWithQueue(treeNode, new HashSet<>());

    }

    boolean dfs(TreeNode treeNode, Set<TreeNode> m) {

        if (m.contains(treeNode)) {
            return true;
        }
        m.add(treeNode);
        List<TreeNode> chills = treeNode.getChills();

        boolean isCyclic = false;
        for (var chill : chills) {
            isCyclic = isCyclic || dfs(chill, m);
        }

        return isCyclic;
    }

    boolean dfsWithQueue(TreeNode treeNode, Set<TreeNode> m) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(treeNode);
        while (!queue.isEmpty()) {
            TreeNode poll = queue.poll();
            if (m.contains(poll)) {
                return true;
            }
            m.add(poll);
            queue.addAll(poll.getChills());
        }
        return false;
    }

}
