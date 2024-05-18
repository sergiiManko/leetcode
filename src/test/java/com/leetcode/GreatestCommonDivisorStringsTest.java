package com.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GreatestCommonDivisorStringsTest {
    @Test
    @DisplayName("Test GCD calculation")
    void testGcd() {
        assertEquals(6, GreatestCommonDivisorStrings.gcd(18, 24), "GCD of 18 and 24 should be 6");
        assertEquals(1, GreatestCommonDivisorStrings.gcd(17, 28), "GCD of 17 and 28 should be 1");
        assertEquals(11, GreatestCommonDivisorStrings.gcd(121, 99), "GCD of 121 and 99 should be 11");
    }

    @ParameterizedTest
    @CsvSource({
            "ABCABC, ABC, ABC",
            "ABABAB, ABAB, AB",
            "A, A, A",
            "AB, BA, ''",
            "ABC, ABCABC, ABC",
            "XYZ, XYZXYZXYZ, XYZ",
            "XYZ, XYZXYZXY, ''",
            "LONGEREXAMPLE, LONGEREXAMPLELONGEREXAMPLE, LONGEREXAMPLE"
    })
    @DisplayName("Test GCD Strings")
    void testGcdStrings(String str1, String str2, String expected) {
        GreatestCommonDivisorStrings gcdStrings = new GreatestCommonDivisorStrings();
        assertEquals(expected, gcdStrings.gcdStrings(str1, str2), String.format("GCD of '%s' and '%s' should be '%s'", str1, str2, expected));
    }

    @Test
    @DisplayName("Test Empty Strings")
    void testEmptyStrings() {
        GreatestCommonDivisorStrings gcdStrings = new GreatestCommonDivisorStrings();
        assertEquals("", gcdStrings.gcdStrings("", ""), "GCD of two empty strings should be empty string");
    }
}