package org.example;

public class WoodenStick {
    int findWoodenStick(int a, int b) {

        int x = a + b;

        int tmp = (x / 4);

        while (tmp > 0) {
            int x1 = a / tmp;
            int x2 = 4 - x1;
            if (x2 <= b / tmp) {
                return tmp;
            }
            tmp--;
        }
        return 0;
    }
}
