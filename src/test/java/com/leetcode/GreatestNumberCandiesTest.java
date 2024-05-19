package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class GreatestNumberCandiesTest {
    private GreatestNumberCandies greatestNumberCandies;

    @BeforeEach
    void setUp() {
        greatestNumberCandies = new GreatestNumberCandies();
    }

    @Test
    void testAllKidsGetMaxCandies() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> expected = Arrays.asList(true, true, true, false, true); // Correcting the expected result for the fourth child
        assertEquals(expected, greatestNumberCandies.kidsWithCandies(candies, extraCandies), "All kids should have max candies");
    }


    @Test
    void testOnlySomeKidsGetMaxCandies() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);
        assertEquals(expected, greatestNumberCandies.kidsWithCandies(candies, extraCandies), "Only the kid with the most candies can reach the maximum");
    }

    @Test
    void testNoExtraCandies() {
        int[] candies = {3, 2, 5, 1};
        int extraCandies = 0;
        List<Boolean> expected = Arrays.asList(false, false, true, false);
        assertEquals(expected, greatestNumberCandies.kidsWithCandies(candies, extraCandies), "Only the kid with the maximum initially has the max candies with no extras");
    }

    @Test
    void testSingleChild() {
        int[] candies = {7};
        int extraCandies = 5;
        List<Boolean> expected = List.of(true);
        assertEquals(expected, greatestNumberCandies.kidsWithCandies(candies, extraCandies), "Single child should always have the most candies");
    }

    @Test
    void testEmptyCandiesList() {
        int[] candies = {};
        int extraCandies = 3;
        List<Boolean> expected = List.of();
        assertEquals(expected, greatestNumberCandies.kidsWithCandies(candies, extraCandies), "Empty list should return an empty result list");
    }

}