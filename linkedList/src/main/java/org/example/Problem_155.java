package org.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_155 {

}

class MinStack {
    static class Node {
        Integer curMin;
        Integer value;

        public Node(Integer curMin, Integer value) {
            this.curMin = curMin;
            this.value = value;
        }
    }

    Deque<Node> deque = new ArrayDeque<>();


    public MinStack() {

    }

    public void push(int val) {
        if (deque.isEmpty()) {
            deque.addFirst(new Node(val, val));
        } else {
            Integer min = Math.min(val, deque.getFirst().curMin);
            deque.addFirst(new Node(min, val));
        }

    }

    public void pop() {
        deque.removeFirst();
    }

    public int top() {
        return deque.getFirst().value;
    }

    public int getMin() {
        return deque.getFirst().curMin;
    }
}