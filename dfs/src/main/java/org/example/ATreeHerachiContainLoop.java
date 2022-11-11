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
        return dfs(treeNode, new HashSet<>());

    }

    boolean dfs(TreeNode treeNode, Set<TreeNode> m) {
        if (treeNode == null) {
            return false;
        }
        if (m.contains(treeNode)) {
            return true;
        }
        m.add(treeNode);
        return treeNode
                .getChills()
                .stream()
                .map(item -> dfs(item, m)).toList()
                .stream()
                .anyMatch(item -> item);


    }
}
