package com.dawool;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();

        int[] kg = new int[people];
        int[] cm = new int[people];
        int[] rank = new int[people];

        for (int i = 0; i < people; i++) {
            kg[i] = sc.nextInt();
            cm[i] = sc.nextInt();
        }

        for (int i = 0; i < people; i++) {
            rank[i] = 1;
            for (int j = 0; j < people; j++) {
                if (kg[j] > kg[i] && cm[j] > cm[i]) rank[i]++;
            }
            System.out.printf("%d ", rank[i]);
        }
    }
}