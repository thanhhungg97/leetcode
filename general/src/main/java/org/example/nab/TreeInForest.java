import java.util.Arrays;

public class TreeInForest {
    public int solution(int[] X, int[] Y) {
        Arrays.sort(X);
        int result = Integer.MIN_VALUE;
        for (int i = 1; i < X.length; i++) {
            result = Math.max(result, X[i] - X[i - 1]);
        }
        return result;
    }

    public static void main(String[] args) {
        TreeInForest bai3 = new TreeInForest();
        System.out.println(bai3.solution(new int[]{1, 8, 7, 3, 4, 1, 8}, new int[]{6, 4, 1, 8, 5, 1, 7}));
        System.out.println(bai3.solution(new int[]{5, 5, 5, 7, 7, 7}, new int[]{3, 4, 5, 1, 3, 7}));

        System.out.println(bai3.solution(new int[]{6, 10, 1, 4, 3}, new int[]{2, 5, 3, 1, 6}));

        System.out.println(bai3.solution(new int[]{1, 1}, new int[]{1, 2}));


    }
}
