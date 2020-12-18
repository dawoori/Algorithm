package com.dawool;

public class Solution {
    int[][] dp;

    public int knapsack(int[] w, int[] v, int k) {
        dp = new int[w.length][k + 1];
        int answer = 0;
        answer = Math.max(dfs(w, v, k, 0, 0), answer);
        return answer;
    }

    int dfs(int[] w, int[] v, int k, int idx, int nowW) {
        if (nowW > k) return -1 * v[idx - 1];
        if (idx >= w.length) return 0;
        if (dp[idx][nowW] > 0) return dp[idx][nowW];
        return dp[idx][nowW] = Math.max(dfs(w, v, k, idx + 1, nowW), dfs(w, v, k, idx + 1, nowW + w[idx]) + v[idx]);
    }
}