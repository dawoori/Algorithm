package com.dawool;

public class Knapsack {
    int[] weight = {3, 4, 1, 2, 3};
    int[] value = {2, 3, 2, 3, 6};
    int maxWeight = 10;
    int[][] dp = new int[6][11];

    int knapsack(int n, int w) {
        if (w > maxWeight) return -1 * value[n - 1];
        if (n >= weight.length) return 0;
        if (dp[n][w] > 0) return dp[n][w];
        return dp[n][w] = Math.max(knapsack(n + 1, w), knapsack(n + 1, w + weight[n]) + value[n]);
    }
}
