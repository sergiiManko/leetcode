package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxConsecutiveOnesTest {

  @Test
  void testLongestOnesBasic() {
    int[] nums = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1};
    int k = 2;
    assertEquals(7, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length of subarray with at most 2 flipped zeros should be 7");
  }

  @Test
  void testLongestOnesAllOnes() {
    int[] nums = {1, 1, 1, 1};
    int k = 1;
    assertEquals(4, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length should be 4 as all are ones");
  }

  @Test
  void testLongestOnesAllZeros() {
    int[] nums = {0, 0, 0, 0};
    int k = 2;
    assertEquals(2, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length should be 2 as we can only flip 2 zeros");
  }

  @Test
  void testLongestOnesNoFlipAllowed() {
    int[] nums = {0, 1, 0, 1, 1, 0, 1, 0, 1};
    int k = 0;
    assertEquals(2, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length should be 2 as no zeros can be flipped");
  }

  @Test
  void testLongestOnesSingleElement() {
    int[] nums = {0};
    int k = 1;
    assertEquals(1, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length should be 1 as the single zero can be flipped");
  }

  @Test
  void testLongestOnesEmptyArray() {
    int[] nums = {};
    int k = 1;
    assertEquals(0, new MaxConsecutiveOnes().longestOnes(nums, k),
        "Max length should be 0 for an empty array");
  }
}