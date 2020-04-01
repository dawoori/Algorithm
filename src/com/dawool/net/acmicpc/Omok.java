package com.dawool.net.acmicpc;
//https://www.acmicpc.net/problem/2072

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Omok {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int numN = Integer.parseInt(br.readLine());
        boolean[][] black = new boolean[19][19];
        boolean[][] white = new boolean[19][19];
        boolean turnOfBlack = true;
        // - | \ /
        for (int i = 0; i < numN; i++) {
            st = new StringTokenizer(br.readLine());
            if(turnOfBlack) {
                black[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
                turnOfBlack = false;
            }
            else {
                white[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
                turnOfBlack = true;
            }

        }
    }
}
