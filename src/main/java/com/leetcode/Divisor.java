package com.leetcode;

/**
 * @author Serhii Manko
 * Alice and Bob take turns playing a game, with Alice starting first.
 * <p>
 * Initially, there is a number n on the chalkboard. On each player's turn, that player makes a move consisting of:
 * <p>
 * Choosing any x with 0 < x < n and n % x == 0.
 * Replacing the number n on the chalkboard with n - x.
 * Also, if a player cannot make a move, they lose the game.
 * <p>
 * Return true if and only if Alice wins the game, assuming both players play optimally.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: true
 * Explanation: Alice chooses 1, and Bob has no more moves.
 */
public class Divisor {
    public boolean divisorGame(int n) {
        return (n & 1) == 0;
    }
}
