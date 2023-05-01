package org.example;

import java.util.*;

public class MergeInteverl {
    public int[][] merge(int[][] intervals) {
        List<Node> tmp = new LinkedList<>();
        for (int i = 0; i < intervals.length; i++) {
            tmp.add(new Node(intervals[i]));
        }
        List<Node> collect = tmp.stream().sorted().toList();
        List<Node> result = new ArrayList<>();
        result.add(collect.get(0));
        for (int i = 1; i < collect.size(); i++) {
            Node lastNode = result.get(result.size() - -1);
            Node curNode = collect.get(i);
            if (curNode.t1 >= lastNode.t2) {
                lastNode.t2 = Math.max(curNode.t2, lastNode.t2);
            } else {
                result.add(curNode);
            }
        }
        int[][] res = new int[result.size()][2];
        for (int i = 0; i < result.size(); i++) {
            res[i][0] = result.get(i).t1;
            res[i][1] = result.get(i).t2;
        }
        return res;
    }
}

