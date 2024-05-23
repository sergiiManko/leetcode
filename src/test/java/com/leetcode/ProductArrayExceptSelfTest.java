package com.leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * @author Serhii Manko
 */
class ProductArrayExceptSelfTest {
    private ProductArrayExceptSelf productArrayExceptSelf;

    @BeforeEach
    void setUp() {
        productArrayExceptSelf = new ProductArrayExceptSelf();
    }

    @Test
    void testBasicFunctionality() {
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        assertArrayEquals(expected, productArrayExceptSelf.productExceptSelf(nums), "Should compute the product of all elements except itself");
    }

    @Test
    void testArrayWithZero() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] expected = {24, 0, 0, 0, 0};
        assertArrayEquals(expected, productArrayExceptSelf.productExceptSelf(nums), "Should handle zeros correctly");
    }

    @Test
    void testArrayWithNegatives() {
        int[] nums = {-1, -2, -3, -4};
        int[] expected = {-24, -12, -8, -6};
        assertArrayEquals(expected, productArrayExceptSelf.productExceptSelf(nums), "Should handle negative numbers correctly");
    }

    @Test
    void testArrayWithOneElement() {
        int[] nums = {1};
        int[] expected = {1};
        assertArrayEquals(expected, productArrayExceptSelf.productExceptSelf(nums), "Should handle single element arrays correctly");
    }

    @Test
    void testLargeArray() {
        int[] nums = new int[100];
        java.util.Arrays.fill(nums, 1);
        int[] expected = new int[100];
        java.util.Arrays.fill(expected, 1);
        assertArrayEquals(expected, productArrayExceptSelf.productExceptSelf(nums), "Should handle large arrays of ones");
    }

}