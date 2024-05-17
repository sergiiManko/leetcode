package com.leetcode;

/**
 * @author Sergey Manko
 */
public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder result = new StringBuilder();
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }
        result.append(word1.substring(i));
        result.append(word2.substring(j));
        return result.toString();
    }
}
