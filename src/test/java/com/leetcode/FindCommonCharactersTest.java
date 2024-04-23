package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Serhii Manko
 */
class FindCommonCharactersTest {
    @Test
    void testCommonCharsWithMultipleWords() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{"bella", "label", "roller"});
        List<String> expected = Arrays.asList("e", "l", "l");
        assertTrue(result.containsAll(expected) && expected.containsAll(result),
                "Should return common characters including duplicates");
    }

    @Test
    void testCommonCharsWithDifferentWords() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{"cool", "lock", "cook"});
        List<String> expected = Arrays.asList("c", "o");
        assertTrue(result.containsAll(expected) && expected.containsAll(result),
                "Should return common characters");
    }

    @Test
    void testNoCommonCharacters() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{"cat", "dog", "bird"});
        assertTrue(result.isEmpty(), "Should return an empty list when no common characters");
    }

    @Test
    void testAllIdenticalWords() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{"test", "test", "test"});
        List<String> expected = Arrays.asList("t", "e", "s", "t");
        assertTrue(result.containsAll(expected) && expected.containsAll(result),
                "Should return all characters from identical words");
    }

    @Test
    void testSingleWord() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{"single"});
        List<String> expected = Arrays.asList("s", "i", "n", "g", "l", "e");
        assertTrue(result.containsAll(expected) && expected.containsAll(result),
                "Should return all characters when there is only one word");
    }

    @Test
    void testEmptyInput() {
        FindCommonCharacters commonCharsFinder = new FindCommonCharacters();
        List<String> result = commonCharsFinder.commonChars(new String[]{});
        assertTrue(result.isEmpty(), "Should return an empty list when input is empty");
    }
}