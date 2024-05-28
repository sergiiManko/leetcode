package com.leetcode.two_pointers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class IsSubsequenceTest {
    private static Stream<Arguments> provideTestCases() {
        return Stream.of(
                Arguments.of("abc", "ahbgdc", true),
                Arguments.of("axc", "ahbgdc", false),
                Arguments.of("", "ahbgdc", true),
                Arguments.of("abc", "", false),
                Arguments.of("abc", null, false),
                Arguments.of(null, "ahbgdc", false),
                Arguments.of("", "", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideTestCases")
    void testIsSubsequence(String s, String t, boolean expected) {
        IsSubsequence subsequenceChecker = new IsSubsequence();
        assertEquals(expected, subsequenceChecker.isSubsequence(s, t),
                String.format("Testing if '%s' is a subsequence of '%s'. Expected: %b", s, t, expected));
    }
}