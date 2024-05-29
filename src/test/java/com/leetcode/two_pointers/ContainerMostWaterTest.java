package com.leetcode.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class ContainerMostWaterTest {
    
    private static Stream<Arguments> provideDataForMaxArea() {
        return Stream.of(
                Arguments.of(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49),
                Arguments.of(new int[]{1, 1}, 1),
                Arguments.of(new int[]{4, 3, 2, 1, 4}, 16),
                Arguments.of(new int[]{1, 2, 1}, 2),
                Arguments.of(new int[]{1, 3, 2, 5, 25, 24, 5}, 24)
        );
    }

    @ParameterizedTest
    @MethodSource("provideDataForMaxArea")
    void testMaxArea(int[] height, int expected) {
        ContainerMostWater solver = new ContainerMostWater();
        assertEquals(expected, solver.maxArea(height), "The calculated maximum area should be correct.");
    }

}