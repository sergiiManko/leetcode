package com.leetcode.sliding_window;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class MaximumAverageSubarrayITest {

    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of(new int[]{1, 12, -5, -6, 50, 3}, 4, 12.75000),
                Arguments.of(new int[]{5}, 1, 5.00000),
                Arguments.of(new int[]{0, 1, 1, 3, 3}, 3, 2.33333),
                Arguments.of(new int[]{-1, -12, -5, -6, -50, -3}, 2, -5.50000),
                Arguments.of(new int[]{1, 1, 1, 1, 1, 1}, 6, 1.00000)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testFindMaxAverage(int[] nums, int k, double expected) {
        MaximumAverageSubarrayI solution = new MaximumAverageSubarrayI();
        assertEquals(expected, solution.findMaxAverage(nums, k), 0.00001);
    }
}