package org.example;

public class StoneGameII {

    public int stoneGameII(int[] piles) {
        int[][][] mem = new int[piles.length][100][2];
        return helper(piles, 1, 0, true, mem);
    }

    private int helper(int[] piles, int m, int index, boolean alice, int[][][] mem) {
        if (index >= piles.length) {
            return 0;
        } else {
            int aliceInt = alice ? 1 : 0;
            if (mem[index][m][aliceInt] != 0) {
                return mem[index][m][aliceInt];
            }
            int res = alice ? 0 : Integer.MAX_VALUE;
            int total = 0;
            for (int curM = 1; curM <= 2 * m; curM++) {
                int newIndex = index + curM;
                if (newIndex <= piles.length) {
                    total += piles[newIndex - 1];
                    if (alice) {
                        res = Math.max(res, total + helper(piles, Math.max(curM, m), newIndex, false, mem));
                    } else {
                        res = Math.min(res, helper(piles, Math.max(curM, m), newIndex, true, mem));
                    }
                }
            }
            mem[index][m][aliceInt] = res;
            return res;
        }
    }
}
