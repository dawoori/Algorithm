package com.dawool.net.acmicpc;
//https://www.acmicpc.net/problem/1085

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EscapeRectangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int answer = x;
        answer = Math.min(answer, y);
        answer = Math.min(answer, w - x);
        answer = Math.min(answer, h - y);

        System.out.println(answer);
    }
}
