package com.leetcode.two_pointers;

/**
 * @author Serhii Manko
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Position to place the next non-zero element

        // First pass: move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex++] = nums[i];
            }
        }

        // Second pass: fill the rest of the array with zeros
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
