//https://www.acmicpc.net/problem/1149
package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class RGBInstance {

    static int[] rgb;
    static int n;
    static int[][] cost;
    static int minCost;
    static int[] tempCost;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        cost = new int[n][3];
        tempCost = new int[n];

        for (int i = 0; i < n; i++) {
            String[] s = br.readLine().split(" ");
            cost[i][0] = Integer.parseInt(s[0]);
            cost[i][1] = Integer.parseInt(s[1]);
            cost[i][2] = Integer.parseInt(s[2]);
        }

        rgb = new int[n];
        dfs(0);
        System.out.println(minCost);
    }

    static void dfs(int house) {
        if (house == 0) {
            for (int i = 0; i < 3; i++) {
                rgb[0] = i;
                tempCost[0] = cost[0][i];
                dfs(1);
            }
        }
        else {
            for (int i = 0; i < 3; i++) {
                if (house > 0 && rgb[house - 1] == i) continue;
                rgb[house] = i;
                tempCost[house] = tempCost[house - 1] + cost[house][i];
                if (house < n - 1) {
                    dfs(house + 1);
                    continue;
                }
                if (minCost == 0) minCost = tempCost[n - 1];
                else minCost = Math.min(minCost, tempCost[n - 1]);
            }
        }
    }
}
