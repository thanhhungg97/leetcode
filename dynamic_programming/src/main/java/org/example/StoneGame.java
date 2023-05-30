package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StoneGame {
    public boolean stoneGame(int[] piles) {
        Map<String, Integer> map = new HashMap<>();
        int alice = help(piles, true, 0, piles.length - 1, map);
        return alice > 0;
    }

    private int help(int[] piles, boolean isAlice, int i, int j, Map<String, Integer> map) {
        if (i > j) {
            return 0;
        } else {
            String key = String.valueOf(i) + j + isAlice;
            if (map.containsKey(key)) {
                return map.get(key);
            }
            int alicePicked = isAlice ? 0 : Integer.MAX_VALUE;

            if (isAlice) {
                alicePicked = Math.max(alicePicked, Math.max(help(piles, false, i + 1, j, map) + piles[i], help(piles, false, i, j - 1, map) + piles[j]));
            } else {
                alicePicked = Math.min(alicePicked, Math.min(-piles[i] + help(piles, true, i + 1, j, map), -piles[j] + help(piles, true, i, j - 1, map)));
            }
            map.put(key, alicePicked);
            return alicePicked;

        }

    }

}
