package com.leetcode;

/**
 * @author Serhii Manko
 */
public class StringCompression {
    public int compress(char[] chars) {
        int write = 0; // Position to write the next character or count
        int read = 0;  // Position to read the next character

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the number of occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the current character to the write position
            chars[write++] = currentChar;

            // If the count is greater than 1, write the count to the array
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

}
