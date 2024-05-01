package com.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class UncrossedLinesTest {

  @Test
  void testEmptyArrays() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(0, uncrossed.maxUncrossedLines(new int[]{}, new int[]{}), "Expect 0 lines when both arrays are empty");
  }

  @Test
  void testOneEmptyArray() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(0, uncrossed.maxUncrossedLines(new int[]{1, 2, 3}, new int[]{}), "Expect 0 lines when one array is empty");
  }

  @Test
  void testIdenticalArrays() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(3, uncrossed.maxUncrossedLines(new int[]{1, 2, 3}, new int[]{1, 2, 3}), "Expect 3 lines when arrays are identical");
  }

  @Test
  void testNoCommonElements() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(0, uncrossed.maxUncrossedLines(new int[]{1, 2, 3}, new int[]{4, 5, 6}), "Expect 0 lines when there are no common elements");
  }

  @Test
  void testSomeCommonElements() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(2, uncrossed.maxUncrossedLines(new int[]{1, 4, 2, 3}, new int[]{2, 4, 1, 3}), "Expect 2 lines when some elements are common");
  }

  @Test
  void testAllElementsMatchButInDifferentOrder() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(1, uncrossed.maxUncrossedLines(new int[]{1, 2, 3}, new int[]{3, 2, 1}), "Expect 1 line for reversed arrays");
  }

  @Test
  void testLargeArrays() {
    UncrossedLines uncrossed = new UncrossedLines();
    int[] nums1 = new int[100];
    int[] nums2 = new int[100];
    for (int i = 0; i < 100; i++) {
      nums1[i] = i;
      nums2[i] = 99 - i;
    }
    assertEquals(1, uncrossed.maxUncrossedLines(nums1, nums2), "Expect 1 line when large arrays have only one match at opposite ends");
  }

  @Test
  void testDuplicateValues() {
    UncrossedLines uncrossed = new UncrossedLines();
    assertEquals(3, uncrossed.maxUncrossedLines(new int[]{1, 2, 1, 3, 1}, new int[]{1, 1, 1, 2, 3}), "Expect lines to cross maximum times with duplicate values");
  }
}