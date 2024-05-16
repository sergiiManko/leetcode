package com.leetcode;

/**
 * @author Serhii Manko
 * Given an array points where points[i] = [xi, yi] represents a point on the X-Y plane, return true if these points are a boomerang.
 * <p>
 * A boomerang is a set of three points that are all distinct and not in a straight line.
 * <p>
 * Example 1:
 * <p>
 * Input: points = [[1,1],[2,3],[3,2]]
 * Output: true
 */
public class ValidBoomerang {
    public boolean isBoomerang(int[][] points) {
        return (points[0][0] - points[1][0]) * (points[1][1] - points[2][1]) !=
                (points[1][0] - points[2][0]) * (points[0][1] - points[1][1]);
    }
}
