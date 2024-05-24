package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IncreasingTripletTest {
    private IncreasingTriplet increasingTriplet;

    @BeforeEach
    void setUp() {
        increasingTriplet = new IncreasingTriplet();
    }

    @Test
    void testIncreasingTripletExists() {
        assertTrue(increasingTriplet.increasingTriplet(new int[]{1, 2, 3, 4, 5}), "Should return true for a clear increasing sequence");
        assertTrue(increasingTriplet.increasingTriplet(new int[]{5, 1, 5, 5, 2, 5, 4}), "Should return true for non-consecutive but increasing triplet");
    }

    @Test
    void testIncreasingTripletDoesNotExist() {
        assertFalse(increasingTriplet.increasingTriplet(new int[]{5, 4, 3, 2, 1}), "Should return false for a decreasing sequence");
        assertFalse(increasingTriplet.increasingTriplet(new int[]{2, 2, 2, 2, 2}), "Should return false for all elements equal");
    }

    @Test
    void testArrayWithNegatives() {
        assertTrue(increasingTriplet.increasingTriplet(new int[]{-5, -4, -3, -5, -6}), "Should return true when there is a valid increasing triplet with negative numbers");
    }

    @Test
    void testArrayWithNegativesNoTriplet() {
        assertFalse(increasingTriplet.increasingTriplet(new int[]{-5, -6, -7, -8, -7, -8}), "Should return false when no increasing triplet exists with negative numbers");
    }

    @Test
    void testEdgeCases() {
        assertFalse(increasingTriplet.increasingTriplet(new int[]{1, 2}), "Should return false for less than three elements");
        assertTrue(increasingTriplet.increasingTriplet(new int[]{1, 2, 3}), "Should return true for exactly three increasing elements");
        assertFalse(increasingTriplet.increasingTriplet(new int[]{1}), "Should return false for a single element");
    }

}