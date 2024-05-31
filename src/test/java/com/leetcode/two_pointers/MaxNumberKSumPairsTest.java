package com.leetcode.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class MaxNumberKSumPairsTest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4}, 5, 2),
                Arguments.of(new int[]{3, 1, 3, 4, 3}, 6, 1),
                Arguments.of(new int[]{1, 2, 3, 4, 5, 6}, 7, 3),
                Arguments.of(new int[]{2, 2, 2, 2}, 4, 2),
                Arguments.of(new int[]{5, 6, 7, 8, 9}, 10, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testMaxOperations(int[] nums, int k, int expected) {
        MaxNumberKSumPairs maxOps = new MaxNumberKSumPairs();
        assertEquals(expected, maxOps.maxOperations(nums, k));
    }
}