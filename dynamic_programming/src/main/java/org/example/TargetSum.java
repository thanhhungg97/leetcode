package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TargetSum {
    class Pair {
        int first;
        int last;

        public Pair(int first, int last) {
            this.first = first;
            this.last = last;
        }

        public int getFirst() {
            return first;
        }

        public int getLast() {
            return last;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && last == pair.last;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, last);
        }
    }

    public int findTargetSumWays(int[] nums, int target) {
        Map<Pair, Integer> map = new HashMap<>();
        return helper(0, nums, target, map);
    }

    private int helper(int i, int[] nums, int target, Map<Pair, Integer> map) {

        if (i == nums.length) {
            return target == 0 ? 1 : 0;
        }
        Pair pair = new Pair(target, nums[i]);
        if (map.containsKey(pair)) {
            return map.get(pair);
        }
        int t2 = helper(i + 1, nums, target - nums[i], map);
        int t1 = helper(i + 1, nums, target + nums[i], map);
        map.put(pair, t1 + t2);
        return t1 + t2;
    }
}
