package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidBoomerangTest {
    @Test
    void testPointsOnSameLine() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertFalse(boomerang.isBoomerang(new int[][]{{1, 1}, {2, 2}, {3, 3}}), "Should be false as points are on the same line");
    }

    @Test
    void testPointsMakeBoomerang() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertTrue(boomerang.isBoomerang(new int[][]{{1, 1}, {2, 3}, {3, 2}}), "Should be true as points do not lie on the same line");
    }

    @Test
    void testPointsAreIdentical() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertFalse(boomerang.isBoomerang(new int[][]{{1, 1}, {1, 1}, {1, 1}}), "Should be false as all points are identical");
    }

    @Test
    void testTwoPointsAreSame() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertFalse(boomerang.isBoomerang(new int[][]{{1, 1}, {1, 1}, {2, 2}}), "Should be false as two points are the same");
    }

    @Test
    void testPointsWithNegativeCoordinates() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertFalse(boomerang.isBoomerang(new int[][]{{-1, -1}, {0, 0}, {1, 1}}), "Should be false as points are on the same line with negative coordinates");
    }

    @Test
    void testPointsWithLargeCoordinates() {
        ValidBoomerang boomerang = new ValidBoomerang();
        assertTrue(boomerang.isBoomerang(new int[][]{{10000, 10000}, {20000, 30000}, {30000, 20000}}), "Should be true as points do not lie on the same line with large coordinates");
    }

}