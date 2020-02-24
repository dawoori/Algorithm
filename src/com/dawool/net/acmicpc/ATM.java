
package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] minutes = new int[n];
        int minSum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            minutes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(minutes);
        for (int i = 0; i < n; i++) {
            minSum += minutes[i] * (n - i);
        }
        System.out.println(minSum);
    }
}
