package com.dawool;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt(), line = sc.nextInt(), start = sc.nextInt();

        ArrayList<Integer>[] A = new ArrayList[node];
        for (int i=0;i<node;i++) A[i] = new ArrayList<>();

        for (int i=0;i<line;i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            A[a-1].add(b-1);
            A[b-1].add(a-1);
        }

        for (ArrayList i : A) {
            Collections.sort(i);
            System.out.println(i);
        }

        int[] dfs = new int[node];
        int[] bfs = new int[node];
    }
}