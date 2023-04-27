package org.example;

import java.util.LinkedList;
import java.util.List;

public class DistanceBetween {
    int solution(int[] blocks) {
        List<Integer> peek = new LinkedList<>();
        peek.add(0);
        for (int i = 1; i < blocks.length - 1; i++) {
            if ((blocks[i - 1] <= blocks[i]) && blocks[i] > blocks[i + 1]) {
                peek.add(i);
            }
        }
        peek.add(blocks.length - 1);

        int max = 0;
        for (int i = 1; i < peek.size(); i++) {
            max = Math.max(max, peek.get(i) - peek.get(i - 1) + 1);
        }
        return max;
    }


}
