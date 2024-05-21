package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseVowelsTest {
    private ReverseVowels reverseVowels;

    @BeforeEach
    public void setUp() {
        reverseVowels = new ReverseVowels();
    }

    @Test
    void testReverseVowelsWithVowels() {
        assertEquals("holle", reverseVowels.reverseVowels("hello"), "Vowels in 'hello' should be reversed to 'holle'");
        assertEquals("leotcede", reverseVowels.reverseVowels("leetcode"), "Vowels in 'leetcode' should be reversed to 'leotcede'");
    }

    @Test
    void testReverseVowelsWithoutVowels() {
        assertEquals("rhythm", reverseVowels.reverseVowels("rhythm"), "String without vowels should remain unchanged");
    }

    @Test
    void testReverseVowelsWithSpecialCharacters() {
        assertEquals("A!a", reverseVowels.reverseVowels("a!A"), "String 'a!A' should reverse vowels to 'A!a'");
    }

    @Test
    void testEmptyString() {
        assertEquals("", reverseVowels.reverseVowels(""), "Empty string should return empty");
    }

    @Test
    void testSingleCharacterString() {
        assertEquals("a", reverseVowels.reverseVowels("a"), "Single vowel character should return as is");
        assertEquals("b", reverseVowels.reverseVowels("b"), "Single non-vowel character should return as is");
    }

    @Test
    void testNullInput() {
        assertEquals(null, reverseVowels.reverseVowels(null), "Null input should return null");
    }

}