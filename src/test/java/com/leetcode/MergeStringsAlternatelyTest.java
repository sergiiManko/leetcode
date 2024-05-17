package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternatelyTest {
    private MergeStringsAlternately merger;

    @BeforeEach
    void setUp() {
        merger = new MergeStringsAlternately();
    }

    @Test
    void testEqualLengthStrings() {
        assertEquals("apbqcr", merger.mergeAlternately("abc", "pqr"), "Merging strings of equal length");
    }

    @Test
    void testFirstStringLonger() {
        assertEquals("apbqcd", merger.mergeAlternately("abcd", "pq"), "Merging when first string is longer");
    }

    @Test
    void testSecondStringLonger() {
        assertEquals("apbqrs", merger.mergeAlternately("ab", "pqrs"), "Merging when second string is longer");
    }

    @Test
    void testMinimalLengthStrings() {
        assertEquals("ax", merger.mergeAlternately("a", "x"), "Merging minimal length strings");
    }

    @Test
    void testOneEmptyString() {
        assertEquals("abc", merger.mergeAlternately("abc", ""), "Merging when second string is empty");
        assertEquals("abc", merger.mergeAlternately("", "abc"), "Merging when first string is empty");
    }

    @Test
    void testBothEmptyStrings() {
        assertEquals("", merger.mergeAlternately("", ""), "Merging two empty strings");
    }

}