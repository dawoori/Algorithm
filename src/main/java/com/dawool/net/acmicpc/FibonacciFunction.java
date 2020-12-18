package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FibonacciFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] zero = new int[41];
        int[] one = new int[41];

        zero[0] = 1;
        zero[1] = 0;
        one[0] = 0;
        one[1] = 1;

        for (int i = 2; i < 41; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int inputNumber = Integer.parseInt(br.readLine());
            sb.append(zero[inputNumber]);
            sb.append(" ");
            sb.append(one[inputNumber]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
