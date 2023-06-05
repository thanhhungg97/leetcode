package org.example;

public class CheckIfItIsaStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        int[] coordinate0 = coordinates[0];
        int[] coordinate1 = coordinates[1];

        for (int i = 2; i < coordinates.length; i++) {
            if (!function(coordinates[i][1], coordinates[i][0], coordinate0, coordinate1)) {
                return false;
            }

        }
        return true;
    }

    boolean function(int y, int x, int[] coordinate0, int[] coordinate1) {
        int x1 = coordinate0[0];
        int y1 = coordinate0[1];
        int x2 = coordinate1[0];
        int y2 = coordinate1[1];
        return (y - y1) * (x2 - x1) == (x - x1) * (y2 - y1);
    }
}
