package org.example;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;
        for ( int i = 0 ; i < nums.length - 1; i ++){
            if( nums[i + 1] > nums[i]){
                decreasing = false;
            }
            if( nums[i + 1 ] < nums[i]){
                increasing = false;
            }
        }
        return increasing || decreasing;
    }
}
