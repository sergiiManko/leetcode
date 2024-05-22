package com.leetcode;

/**
 * @author Serhii Manko
 */
public class ReverseWords {
    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        // Trim the string to remove leading and trailing spaces
        s = s.trim();

        // Split the string by one or more spaces
        String[] words = s.split("\\s+");

        // Reverse the list of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
