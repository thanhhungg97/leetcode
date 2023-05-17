package org.example;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        long[] mem = new long[amount + 1];
        long dfs = dfs(coins, amount, mem);

        return dfs >= Integer.MAX_VALUE ? -1 : (int) dfs;
    }

    private long dfs(int[] coins, int amount, long[] mem) {
        if (amount == 0) {
            return 0;
        } else if (amount < 0) {
            return Integer.MAX_VALUE;
        } else {
            if (mem[amount] != 0) {
                return mem[amount];
            }
            long min = Integer.MAX_VALUE;
            for (int i = coins.length - 1; i >= 0; i--) {
                if (amount >= coins[i]) {
                    min = Math.min(min, dfs(coins, amount - coins[i], mem) + 1);
                }

            }
            mem[amount] = min;
            return min;
        }
    }

}
