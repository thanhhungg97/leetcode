package org.example;

public class MaximizeDistancetoClosestPerson {

    /**
     * Using two pointer
     * j mark as the slow pointer, i as fast pointer
     * Two edge case are:
     *  The first and  the last index are 0.
     */
    public int maxDistToClosestOptimize(int[] seats) {
        int distance = 1;
        int j = -1;
        if (seats[0] == 1) {
            j = 0;
        }
        for (int i = 1; i < seats.length; i++) {
            if (seats[i] == 1) {
                if (j < 0) {
                    distance = i;
                } else {
                    distance = Math.max(distance, (i - j) / 2);
                }
                j = i;
            }

        }

        if (seats[seats.length - 1] == 0) {
            distance = Math.max(distance, seats.length - 1 - j);
        }

        return distance;


    }

    public int maxDistToClosest(int[] seats) {
        int max = 1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 0) {
                max = Math.max(max, Math.min(findLeft(i, seats), findRight(i, seats.length, seats)));
            }

        }
        return max;
    }

    int findLeft(int index, int[] seats) {
        if (index == 0) {
            return Integer.MAX_VALUE;
        }
        for (int i = index - 1; i >= 0; i--) {
            if (seats[i] == 1) {
                return index - i;
            }
        }
        return 1;
    }

    int findRight(int index, int maxLength, int[] seats) {
        if (index == maxLength - 1) {
            return Integer.MAX_VALUE;
        }
        for (int i = index + 1; i < maxLength; i++) {
            if (seats[i] == 1) {
                return i - index;
            }
        }
        return 1;
    }
}
