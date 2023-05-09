package org.example;

public class MinNum {

    public static int minNum(int samDaily, int kellyDaily, int difference) {
        if (kellyDaily <= samDaily) {

            return -1;
        }
        float i = (float) difference / (kellyDaily - samDaily);
        return (int) Math.floor(i) + 1;
    }
}
