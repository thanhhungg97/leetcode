package org.example;

public class BestTimetoBuyandSellStock {
    /**
     * Choosing stock at date i, going forward to get the best stock to sell.
     */
    public int maxProfit(int[] prices) {
        int max = 0;
        // choosing date i to buy
        //7,1,5,3,6,4
        // 7 -> max = 0
        // 1 -> max = 6
        // 5 -> max = 6
        // 3  -> max = 6
        // 6 -> max = 6
        // 4 -> max = 0
        for (int i = 0; i < prices.length; i++) {
            // finding to optimize price to sell
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(prices[j] - prices[i], max);
            }
        }
        return max;
    }

    // max date i


    public int maxProfitOptimize(int[] prices) {
        int minSell = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (minSell > prices[i]) {
                minSell = prices[i];
            } else {
                if (max < prices[i] - minSell) {
                    max = prices[i];
                }
            }

        }

        return max;
    }

    /**
     * 7,1,5,3,6,4
     * step 1
     * 7
     * 0
     * step 2
     * 1
     * 0
     * step 3
     * 1
     * 4
     * step 4
     * 1
     * 4
     * step 5
     * 1
     * 5
     * step 6
     */
    public int maxProfitOptimize1(int[] prices) {
        int[] minPrice = new int[prices.length];
        int[] maxProfit = new int[prices.length];
        minPrice[0] = prices[0];
        maxProfit[0] = 0;
        for (int i = 1; i < prices.length; i++) {
            minPrice[i] = Math.min(prices[i], minPrice[i - 1]);
            maxProfit[i] = Math.max(maxProfit[i - 1], prices[i] - minPrice[i - 1]);

        }

        return maxProfit[prices.length - 1];
    }


}
