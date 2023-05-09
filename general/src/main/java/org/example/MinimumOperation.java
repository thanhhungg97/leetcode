package org.example;

import java.util.List;
import java.util.PriorityQueue;

public class MinimumOperation {


    public static int getMinimumOperations(List<Integer> executionTime, int x, int y) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        priorityQueue.addAll(executionTime);
        // Write your code here
        int count = 0;
        while (!priorityQueue.isEmpty()) {
            Integer poll = priorityQueue.poll();
            PriorityQueue<Integer> newQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));
            if (poll - x > 0) {
                newQueue.add(poll - x);
            }
            while (!priorityQueue.isEmpty()) {
                Integer otherPoll = priorityQueue.poll();
                if (otherPoll - y > 0) {
                    newQueue.add(otherPoll - y);
                }
            }
            count++;
            priorityQueue = newQueue;
        }
        return count;
    }
}
