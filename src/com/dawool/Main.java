package com.dawool;

import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numN = Integer.parseInt(st.nextToken());
        int numK = Integer.parseInt(st.nextToken());
        if (numN == numK) {
            System.out.println(0);
            return;
        }

        int[] arr = new int[numN];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < numN; i++) arr[i] = Integer.parseInt(st.nextToken());

        if (numK == 1) {
            System.out.println(arr[numN - 1] - arr[0]);
            return;
        }

        int[] idx = new int[numK - 1];

    }
}