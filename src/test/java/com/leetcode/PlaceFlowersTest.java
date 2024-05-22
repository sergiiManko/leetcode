package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlaceFlowersTest {
    private PlaceFlowers placeFlowers;

    @BeforeEach
    void setUp() {
        placeFlowers = new PlaceFlowers();
    }

    @Test
    void testCanPlaceAllRequiredFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertTrue(placeFlowers.canPlaceFlowers(flowerbed, 1), "Should be able to plant 1 flower");
    }

    @Test
    void testCannotPlaceAllRequiredFlowers() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        assertFalse(placeFlowers.canPlaceFlowers(flowerbed, 2), "Should not be able to plant 2 flowers");
    }

    @Test
    void testEmptyFlowerbed() {
        int[] flowerbed = {0, 0, 0, 0, 0};
        assertTrue(placeFlowers.canPlaceFlowers(flowerbed, 3), "Should be able to plant 3 flowers in empty bed");
    }

    @Test
    void testNoRoomForFlowers() {
        int[] flowerbed = {1, 1, 1, 1, 1};
        assertFalse(placeFlowers.canPlaceFlowers(flowerbed, 1), "Should not be able to plant any flowers");
    }

    @Test
    void testBoundaryConditionsWithSingleZero() {
        int[] flowerbed = {0};
        assertTrue(placeFlowers.canPlaceFlowers(flowerbed, 1), "Should be able to plant 1 flower in single plot bed");
    }

    @Test
    void testBoundaryConditionsWithOneZeroBetweenFlowers() {
        int[] flowerbed = {1, 0, 1};
        assertFalse(placeFlowers.canPlaceFlowers(flowerbed, 1), "Should not be able to plant a flower between two flowers");
    }

    @Test
    void testEdgeOfBedPlanting() {
        int[] flowerbed = {0, 0, 1, 0, 0};
        assertTrue(placeFlowers.canPlaceFlowers(flowerbed, 2), "Should be able to plant flowers at the edges");
    }
}