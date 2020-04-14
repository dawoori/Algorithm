package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OrdinaryBackpack {
    static int maxWeight;
    static int[] weight;
    static int[] value;
    static int[][] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        maxWeight = Integer.parseInt(st.nextToken());
        dp = new int[n + 1][maxWeight + 1];

        weight = new int[n];
        value = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(knapsack(0, 0));
    }

    static int knapsack(int n, int w) {
        if (w > maxWeight) return -1 * value[n - 1];
        if (n >= weight.length) return 0;
        if (dp[n][w] > 0) return dp[n][w];
        return dp[n][w] = Math.max(knapsack(n + 1, w), knapsack(n + 1, w + weight[n]) + value[n]);
    }
}
