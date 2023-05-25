package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class GasStation {
    static class Pair implements Comparable<Pair> {
        int index;
        int value;

        public Pair(int index, int value) {

            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public int compareTo(Pair o) {
            return Integer.compare(value, o.value);
        }
    }

    public PriorityQueue<Pair> preprocessor(int[] gas, int[] cost) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int i = 0; i < gas.length; i++) {
            int exchange = gas[i] - cost[i];
            if (exchange >= 0) {
                priorityQueue.add(new Pair(i, exchange));
            }
        }
        return priorityQueue;
    }

    public int canCompleteCircuit(int[] gas, int[] cost) {
        PriorityQueue<Pair> preprocessor = preprocessor(gas, cost);
        while (!preprocessor.isEmpty()) {
            Pair poll = preprocessor.poll();
            if (tryAt(poll.index, gas, cost)) {
                return poll.index;
            }
        }

        return -1;
    }

    private boolean tryAt(int i, int[] gas, int[] cost) {
        int currentGas = gas[i];
        for (int j = 0; j <= gas.length; j++) {
            currentGas = currentGas - cost[(j + i) % gas.length];
            if (currentGas < 0) {
                return false;
            }
            currentGas += gas[(j + i + 1) % gas.length];

        }
        return true;
    }
}
