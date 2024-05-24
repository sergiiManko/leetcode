package com.leetcode;

/**
 * @author Sergey Manko
 */
public class IncreasingTriplet {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) {
            return false;
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update first to the current smaller value
            } else if (num <= second) {
                second = num; // Update second to the current smaller value
            } else {
                // If we find a number greater than both first and second, we have found our triplet
                return true;
            }
        }

        return false;
    }
}
