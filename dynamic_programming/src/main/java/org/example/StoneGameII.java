package org.example;

public class StoneGameII {

    public int stoneGameII(int[] piles) {
        int[][][] mem = new int[piles.length][100][2];
        return helper(piles, 1, 0, true, mem);
    }

    private int helper(int[] piles, int m, int index, boolean isPickMax, int[][][] mem) {
        if (index >= piles.length) {
            return 0;
        } else {
            int indexxxx = isPickMax ? 1 : 0;
            if (mem[index][m][indexxxx] != 0) {
                return mem[index][m][indexxxx];
            }
            if (isPickMax) {
                int max = Integer.MIN_VALUE;
                int total = 0;
                for (int i = 0; i <= 2 * m - 1; i++) {
                    int newIndex = index + i;
                    if (newIndex < piles.length) {
                        total += piles[newIndex];
                        max = Math.max(max, total + helper(piles, Math.max(i + 1, m), newIndex + 1, false, mem));
                    }
                }
                mem[index][m][indexxxx] = max;
                return max;
            } else {
                int min = Integer.MAX_VALUE;
                for (int i = 0; i <= 2 * m - 1; i++) {
                    int newIndex = index + i;
                    if (newIndex < piles.length) {
                        min = Math.min(min, helper(piles, Math.max(i + 1, m), newIndex + 1, true, mem));
                    }
                }
                mem[index][m][indexxxx] = min;
                return min;
            }
        }

    }
}
