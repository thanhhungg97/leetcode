package org.example;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PopulatingNextRightPointerInEachNodeII {
    public Node connect(Node root, List<List<Node>> list) {
        list.forEach(item -> {
            for (int i = 0; i < list.size() - 1; i++) {
                item.get(i).next = item.get(i + 1).next;
            }
        });
        return null;
    }

    public void bfs(Node root) {
        int dept = 1;

        List<List<Node>> list = new LinkedList<>();


        List<Node> nodes = new ArrayList<>();

        nodes.add(root);
        List<Node> first = new LinkedList<>();
        first.add(root);
        list.add(first);
        while (nodes.size() > 0) {
            Node node = nodes.remove(0);
            dept++;

            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
    }

}
