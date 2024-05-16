package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Serhii Manko
 * Given an array nums of integers, return the length of the longest arithmetic subsequence in nums.
 * <p>
 * Note that:
 * <p>
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements. A sequence seq is
 * arithmetic if seq[i + 1] - seq[i] are all the same value (for 0 <= i < seq.length - 1).
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,6,9,12] Output: 4 Explanation:  The whole array is an arithmetic sequence with steps of length = 3.
 */
public class LongestArithmeticSubsequence {

  public int longestLength(int[] nums) {
    int n = nums.length;
    if (n <= 2) {
      return n;
    }

    int longest = 2;
    List<Map<Integer, Integer>> dp = new ArrayList<>(n);
    for (int i = 0; i < n; i++) {
      dp.add(new HashMap<>());
      for (int j = 0; j < i; j++) {
        int diff = nums[i] - nums[j];
        int count = dp.get(j).getOrDefault(diff, 1) + 1;
        dp.get(i).put(diff, count);
        longest = Math.max(longest, count);
      }
    }

    return longest;
  }
}
