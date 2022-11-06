package org.example;

public class PivotIndex {
    /**
     * 1 2 3 4 5 -3
     *
     *
     */
    public int pivotIndex(int[] nums) {
        int total = 0 ;
        for (int i = 0 ; i <nums.length; i ++ ){
            total += nums[i];
        }
        int left = 0;
        for (int i = 0; i < nums.length; i ++){
            int right = total - nums[i] - left;
            if( left == right){
                return i;
            }
            left += nums[i];

        }
        return -1;
    }
}
