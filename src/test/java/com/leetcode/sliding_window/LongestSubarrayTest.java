package com.leetcode.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class LongestSubarrayTest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 0, 1}, 3),
                Arguments.of(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}, 5),
                Arguments.of(new int[]{1, 1, 1}, 2),
                Arguments.of(new int[]{1, 1, 0, 0, 1, 1, 1, 0, 1, 1}, 5),
                Arguments.of(new int[]{0, 0, 0}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testLongestSubarray(int[] nums, int expected) {
        LongestSubarray solution = new LongestSubarray();
        assertEquals(expected, solution.longestSubarray(nums));
    }
}