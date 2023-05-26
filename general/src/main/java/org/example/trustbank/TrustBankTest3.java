package org.example.trustbank;

import java.util.List;

public class TrustBankTest3 {
    public static long getMaximumProfit(List<Integer> price, List<Integer> profit) {
        int max = -1;
        for (int i = 0; i < price.size() - 2; i++) {
            for (int j = i + 1; j < price.size() - 1; j++) {
                for (int k = j + 1; k < price.size(); k++) {
                    if (price.get(i) < price.get(j) && price.get(j) < price.get(k)) {
                        max = Math.max(profit.get(i) + profit.get(j) + profit.get(k), max);
                    }
                }
            }
        }
        // Write your code here
        return max;
    }
}
