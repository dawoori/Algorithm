//https://www.acmicpc.net/problem/2167
package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfTowDimensionArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] newArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                newArray[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int howMany = Integer.parseInt(br.readLine());
        int[][] IJXY = new int[howMany][4];
        for (int i = 0; i < howMany; i++) {
            st = new StringTokenizer(br.readLine());
            IJXY[i][0] = Integer.parseInt(st.nextToken());
            IJXY[i][1] = Integer.parseInt(st.nextToken());
            IJXY[i][2] = Integer.parseInt(st.nextToken());
            IJXY[i][3] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < howMany; i++) {
            int sum = 0;
            for (int j = IJXY[i][0] - 1; j < IJXY[i][2]; j++) {
                for (int k = IJXY[i][1] - 1; k < IJXY[i][3]; k++) {
                    sum += newArray[j][k];
                }
            }
            System.out.println(sum);
        }

    }
}
