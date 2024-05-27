package com.leetcode.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Serhii Manko
 */
class MoveZeroesTest {

    private static Stream<Arguments> provideArraysForTesting() {
        return Stream.of(
                Arguments.of(new int[]{0, 1, 0, 3, 12}, new int[]{1, 3, 12, 0, 0}),
                Arguments.of(new int[]{0, 0, 0}, new int[]{0, 0, 0}),
                Arguments.of(new int[]{1, 2, 3}, new int[]{1, 2, 3}),
                Arguments.of(new int[]{4, 0, 0, 2, 0, 1}, new int[]{4, 2, 1, 0, 0, 0})
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForTesting")
    void testMoveZeroes(int[] input, int[] expected) {
        MoveZeroes mover = new MoveZeroes();
        mover.moveZeroes(input);
        assertArrayEquals(expected, input, "Arrays should match expected output after moving zeroes");
    }

}