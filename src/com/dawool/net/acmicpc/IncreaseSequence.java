//https://www.acmicpc.net/problem/11053
package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IncreaseSequence {
    static int n;
    static int[] sequence;
    static int[] dp;
    static int[] dpCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        sequence = new int[n];
        dp = new int[n];
        dpCount = new int[n];

        String[] s = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {

            sequence[i] = Integer.parseInt(s[i]);
        }

        System.out.println(dfs(0, 0));
        System.out.println();

    }

    static int dfs(int number, int lastIndex) {
        if (number > n - 1) return 0;
        if (dp[number] != 0) return dp[number];
        if (sequence[number] > sequence[lastIndex] || number == lastIndex) {
            return dp[number] = 1 + dfs(number + 1, number);
        } else {
            return dp[number] = dfs(number + 1, lastIndex);
        }
    }
}
