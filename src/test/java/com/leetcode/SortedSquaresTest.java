package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Serhii Manko
 */
class SortedSquaresTest {
    @Test
    void testSortedSquares() {
        SortedSquares ss = new SortedSquares();
        assertArrayEquals(new int[]{1, 4, 9, 16, 25}, ss.sortedSquares(new int[]{-5, -3, -1, 2, 4}));
        assertArrayEquals(new int[]{0, 1, 9, 16, 100}, ss.sortedSquares(new int[]{-10, -4, 0, 1, 3}));
    }

    @Test
    void testWithAllNegatives() {
        SortedSquares ss = new SortedSquares();
        assertArrayEquals(new int[]{1, 9, 36}, ss.sortedSquares(new int[]{-6, -3, -1}));
    }

    @Test
    void testWithAllPositives() {
        SortedSquares ss = new SortedSquares();
        assertArrayEquals(new int[]{1, 16, 49}, ss.sortedSquares(new int[]{1, 4, 7}));
    }

    @Test
    void testWithSingleElement() {
        SortedSquares ss = new SortedSquares();
        assertArrayEquals(new int[]{25}, ss.sortedSquares(new int[]{5}));
    }
}
