package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringCompressionTest {
    private StringCompression stringCompression;

    @BeforeEach
    void setUp() {
        stringCompression = new StringCompression();
    }

    @Test
    void testBasicCompression() {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int expectedLength = 6; // "a2b2c3"
        int resultLength = stringCompression.compress(chars);
        assertEquals(expectedLength, resultLength, "Compression should count repeated characters correctly");

        char[] expectedResult = {'a', '2', 'b', '2', 'c', '3'};
        char[] actualResult = Arrays.copyOf(chars, resultLength);
        assertArrayEquals(expectedResult, actualResult, "Check compressed array content");
    }

    @Test
    void testNoCompressionNeeded() {
        char[] chars = {'a', 'b', 'c'};
        int expectedLength = 3; // "abc"
        assertEquals(expectedLength, stringCompression.compress(chars), "No compression should happen for unique characters");
    }

    @Test
    void testSingleCharacterCompression() {
        char[] chars = {'z', 'z', 'z', 'z'};
        int expectedLength = 2; // "z4"
        assertEquals(expectedLength, stringCompression.compress(chars), "Single character repeated should be compressed correctly");
    }

    @Test
    void testEmptyArray() {
        char[] chars = new char[0];
        int expectedLength = 0; // ""
        assertEquals(expectedLength, stringCompression.compress(chars), "Empty array should return length 0");
    }

    private void assertArrayEquals(char[] expected, char[] actual, String message) {
        assertEquals(String.valueOf(expected), String.valueOf(actual), message);
    }

}