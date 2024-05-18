package com.leetcode;

/**
 * @author Sergey Manko
 */
public class GreatestCommonDivisorStrings {
    public String gcdStrings(String str1, String str2){
        // Check if str1 + str2 equals str2 + str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        // Compute the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // The GCD string will be the prefix of str1 with length equal to the GCD length
        return str1.substring(0, gcdLength);
    }

    // Helper method to compute the GCD of two integers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
