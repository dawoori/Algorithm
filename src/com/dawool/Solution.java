package com.dawool;

import java.util.*;

class Solution {
    public long howMany(int size, int[] start, int[] end, int numMoves) {
        int height = Math.abs(end[0] - start[0]) + 1;
        int width = Math.abs(end[1] - start[1]) + 1;
        long[][] dp = new long[height][width];
        int[][] number = new int[height][width];

        dp[0][0] = 1;
        for (int i = 0; i < numMoves; i++) {
            for (int j = 0; j < height; j++) {
                for (int k = 0; k < width; k++) {
                    if (number[j][k] == i)
                        if (j > 0) dp[j][k] += dp[j - 1][k];
                    if (k > 0) dp[j][k] += dp[j][k - 1];
                    if (j > 0 && k > 0) dp[j][k] += dp[j - 1][k - 1];
                    if (j > 1 && k > 0) dp[j][k] += dp[j - 2][k - 1];
                    if (j > 0 && k > 1) dp[j][k] += dp[j - 1][k - 2];
                }
            }
        }

        return dp[height - 1][width - 1];
    }
}