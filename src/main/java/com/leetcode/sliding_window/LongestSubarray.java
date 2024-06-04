package com.leetcode.sliding_window;

/**
 * @author Serhii Manko
 */
public class LongestSubarray {
    public int longestSubarray(int[] nums) {
        int left = 0;
        int right = 0;
        int maxLength = 0;
        int zeroCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left);
            right++;
        }

        return maxLength;
    }
}
