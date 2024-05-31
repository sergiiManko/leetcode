package com.leetcode.two_pointers;

import java.util.Arrays;

/**
 * @author Serhii Manko
 */
public class MaxNumberKSumPairs {
    public int maxOperations(int[] nums, int k) {
        // Sort the array
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int operations = 0;

        // Use two pointers to find pairs
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                // Found a pair
                operations++;
                left++;
                right--;
            } else if (sum < k) {
                // Move the left pointer to the right to increase the sum
                left++;
            } else {
                // Move the right pointer to the left to decrease the sum
                right--;
            }
        }

        return operations;
    }
}
