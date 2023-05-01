package org.example;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int[] db = new int[nums.length];
        return helper(nums, 0, db);
    }

    /**
     * 2,3,1,1,4
     * 2 -> 0 -> 1 ; 0 -> 2
     * 1 -> 2 , 1 -> 3, 1 -> 4
     */
    private boolean helper(int[] nums, int i, int[] db) {
        if (db[i] == 1) {
            return true;
        }
        if (db[i] == -1) {
            return false;
        }
        if (i >= nums.length - 1) {
            db[i] = 1;
            return true;
        } else if (nums[i] == 0) {
            db[i] = -1;
            return false;
        } else {
            boolean tmp = false;
            for (int k = nums[i]; k >= 1; k--) {
                if (i + k >= nums.length - 1) {
                    return true;
                }
                tmp = tmp || helper(nums, i + k, db);
            }
            if (!tmp) {
                db[i] = -1;
            } else {
                db[i] = 1;

            }
            return tmp;
        }
    }
}
