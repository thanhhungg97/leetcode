package org.example;

public class SumofSubarrayMinimums {

    public int sumSubarrayMins(int[] arr) {
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int curSum = arr[i];
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                min = Math.min(arr[j], min);
                curSum += min;
            }
            sum += curSum;
        }
        return (int) (sum % (Math.pow(10, 9) + 7));
    }
}
