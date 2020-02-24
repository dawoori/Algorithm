package com.dawool.net.acmicpc;

import javax.lang.model.type.ArrayType;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class OrdinaryBackpack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int maxWeight = Integer.parseInt(st.nextToken());
        int maxValue = 0;
        int[][] dp = new int[n + 1][maxWeight + 1];

        int[] weight = new int[n];
        int[] value = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j <= maxWeight; j++) {
                if (j + weight[i] <= maxWeight) {
                    dp[i + 1][j + weight[i]] = Math.max(dp[i + 1][j + weight[i]], dp[i][j] + value[i]);
                    maxValue = Math.max(dp[i + 1][j + weight[i]], maxValue);
                }
            }
        }
        System.out.println(maxValue);
    }
}
