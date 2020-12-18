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
            if (turnOfBlack) {
                black[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = true;
                if (isOmok(black)) {
                    System.out.println(i + 1);
                    break;
                }
                turnOfBlack = false;
            } else {
                white[Integer.parseInt(st.nextToken()) - 1][Integer.parseInt(st.nextToken()) - 1] = true;
                if (isOmok(white)) {
                    System.out.println(i + 1);
                    break;
                }
                turnOfBlack = true;
            }
        }
    }

    public static boolean isOmok(boolean[][] pan) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                if (!pan[i][j]) break;
                boolean okay = true;
                for (int k = 0; k < 5; k++) {
                    if (!pan[i + k][j]) {
                        okay = false;
                        break;
                    }
                }
                for (int k = 0; k < 5 && !okay; k++) {
                    if (!pan[i][j + k]) {
                        okay = false;
                        break;
                    }
                }
                for (int k = 0; k < 5 && !okay; k++) {
                    if (!pan[i + k][j + k]) {
                        okay = false;
                        break;
                    }
                }
                if (okay) return true;
            }
        }
        return false;
    }
}
