package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestArithmeticSubsequenceTest {

  @Test
  void testEmptyArray() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(0, las.longestLength(new int[]{}), "Expected length is 0 for an empty array");
  }

  @Test
  void testSingleElement() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(1, las.longestLength(new int[]{1}), "Expected length is 1 for a single element array");
  }

  @Test
  void testTwoElements() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(2, las.longestLength(new int[]{1, 2}), "Expected length is 2 for any two elements");
  }

  @Test
  void testNormalCase() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(4, las.longestLength(new int[]{3, 6, 9, 12}), "Expected length is 4 for a perfect arithmetic sequence");
  }

  @Test
  void testMixedNumbers() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(3, las.longestLength(new int[]{10, 7, 4, 3, 20, 50}), "Expected longest arithmetic sequence length is 3");
  }

  @Test
  void testAllSameElements() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(5, las.longestLength(new int[]{5, 5, 5, 5, 5}), "Expected length is 5 for all identical elements, difference is 0");
  }

  @Test
  void testNoCommonDifference() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(3, las.longestLength(new int[]{1, 3, 5, 10, 15}), "Expected length is 3 as there is no common difference that occurs more than once");
  }

  @Test
  void testNegativeAndPositive() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(5, las.longestLength(new int[]{-5, 0, 5, 10, 15}), "Expected length is 5 for sequence including negative and positive numbers");
  }

  @Test
  void testLargeNumbers() {
    LongestArithmeticSubsequence las = new LongestArithmeticSubsequence();
    assertEquals(3, las.longestLength(new int[]{1000000, 1000003, 1000006, 1000001}), "Expected length is 3 for large numbers");
  }
}