package org.example;

/**
 * ^ (bitwise XOR): Bitwise ^ operator performs binary XOR operation bit by bit on the operands. a^b = 1110 which is 14
 * Use Xor/Bit Manipulation
 * Intuition:
 * Xor of any two num gives the difference of bit as 1 and same bit as 0.
 * Thus, using this we get 1 ^ 1 == 0 because the same numbers have same bits.
 * So, we will always get the single element because all the same ones will evaluate to 0 and 0^single_number = single_number.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
