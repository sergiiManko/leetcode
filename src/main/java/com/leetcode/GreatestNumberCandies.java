package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Serhii Manko
 * <p>
 * Time Complexity:O(n)
 * Space Complexity:O(n)
 */
public class GreatestNumberCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}
