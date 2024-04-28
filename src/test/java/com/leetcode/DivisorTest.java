package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DivisorTest {
    @Test
    void testEvenNumber() {
        Divisor divisor = new Divisor();
        assertTrue(divisor.divisorGame(2), "Game should return true for even numbers");
    }

    @Test
    void testOddNumber() {
        Divisor divisor = new Divisor();
        assertFalse(divisor.divisorGame(1), "Game should return false for odd numbers");
    }

    @Test
    void testZero() {
        Divisor divisor = new Divisor();
        assertTrue(divisor.divisorGame(0), "Game should return true for zero");
    }

    @Test
    void testLargeEvenNumber() {
        Divisor divisor = new Divisor();
        assertTrue(divisor.divisorGame(100000), "Game should return true for large even numbers");
    }

    @Test
    void testLargeOddNumber() {
        Divisor divisor = new Divisor();
        assertFalse(divisor.divisorGame(100001), "Game should return false for large odd numbers");
    }

    @Test
    void testNegativeEvenNumber() {
        Divisor divisor = new Divisor();
        assertTrue(divisor.divisorGame(-2), "Game should return true for negative even numbers");
    }

    @Test
    void testNegativeOddNumber() {
        Divisor divisor = new Divisor();
        assertFalse(divisor.divisorGame(-3), "Game should return false for negative odd numbers");
    }
}