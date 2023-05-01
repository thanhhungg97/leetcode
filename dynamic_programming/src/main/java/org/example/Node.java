package org.example;

/**
 * Idea:
 * we hold the ans, and the current maxsimum;
 */
public class Node implements Comparable<Node> {
    Integer t1;
    Integer t2;

    @Override
    public int compareTo(Node o) {
        return t1.compareTo(o.t1);
    }

    Node(int[] tmp) {
        this.t1 = tmp[0];
        this.t2 = tmp[1];
    }
}
