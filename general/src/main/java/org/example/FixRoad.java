package org.example;

import java.util.PriorityQueue;

public class FixRoad {
    int fixRoad(String s, int num) {
        char[] chars = s.toCharArray();
        PriorityQueue<Integer> queue = new PriorityQueue<>(( a, b) -> Integer.compare(b, a));
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '.') {
                int j = i;
                int count = 0;
                while (j < chars.length && chars[j] != '.') {
                    count++;
                    j++;
                }
                queue.add(count);
                i = j;
            }
        }
        int result = 0;
        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (poll + 1 < num) {
                result += poll;
                num -= poll + 1;
            } else {
                result += num - 1;
                break;
            }
        }
        return result;
    }
}
