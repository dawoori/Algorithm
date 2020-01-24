package com.dawool;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        String[] board = new String[height];

        for (int i = 0; i < height; i++) {
            board[i] = sc.next();
        }

        int mini = 64;
        int preMin, rectangle;
        for (int k = 0; k < height - 7; k++) {
            preMin = 64;
            for (int l = 0; l < width - 7; l++) {
                rectangle = 0;
                for (int i = k; i < k + 8; i++) {
                    for (int j = l; j < l + 8; j++) {
                        if ((i + j) % 2 == 0 && board[i].charAt(j) == 'B') rectangle++;
                        if ((i + j) % 2 == 1 && board[i].charAt(j) == 'W') rectangle++;
                    }
                }

                preMin = Math.min(rectangle, 64 - rectangle);
                mini = Math.min(mini, preMin);
            }
        }
        System.out.println(mini);
    }
}