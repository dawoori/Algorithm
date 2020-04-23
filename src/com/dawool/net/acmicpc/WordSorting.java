package com.dawool.net.acmicpc;
//https://www.acmicpc.net/problem/1181

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numN = Integer.parseInt(br.readLine());
        String[] words = new String[numN];
        for (int i = 0; i < numN; i++) {
            words[i] = br.readLine();
        }

        System.out.println(Arrays.toString(words));
    }
}

