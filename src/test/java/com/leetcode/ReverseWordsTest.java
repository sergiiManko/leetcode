package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Serhii Manko
 */
class ReverseWordsTest {
    private ReverseWords reverseWords;

    @BeforeEach
    void setUp() {
        reverseWords = new ReverseWords();
    }

    @Test
    void testReverseMultipleWords() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, reverseWords.reverseWords(input), "Should reverse multiple words correctly");
    }

    @Test
    void testReverseWithLeadingAndTrailingSpaces() {
        String input = "  hello world  ";
        String expected = "world hello";
        assertEquals(expected, reverseWords.reverseWords(input), "Should handle leading and trailing spaces");
    }

    @Test
    void testReverseWithMultipleSpacesBetweenWords() {
        String input = "a   lot  of   spaces";
        String expected = "spaces of lot a";
        assertEquals(expected, reverseWords.reverseWords(input), "Should handle multiple spaces between words");
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, reverseWords.reverseWords(input), "Should return empty string for empty input");
    }

    @Test
    void testSingleWord() {
        String input = "single";
        String expected = "single";
        assertEquals(expected, reverseWords.reverseWords(input), "Should return the single word unchanged");
    }

    @Test
    void testNullInput() {
        String input = null;
        String expected = null;
        assertEquals(expected, reverseWords.reverseWords(input), "Should return null for null input");
    }
}