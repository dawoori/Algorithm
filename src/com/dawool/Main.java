package com.dawool;

import java.util.*;

class Main {
    static boolean[] visit;
    static ArrayList<Integer>[] A;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int node = sc.nextInt(), line = sc.nextInt(), start = sc.nextInt();

        A = new ArrayList[node+1];
        for (int i=0;i<node+1;i++) A[i] = new ArrayList<>();

        for (int i=0;i<line;i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            A[a].add(b);
            A[b].add(a);
        }

        for (ArrayList i : A) {
            Collections.sort(i);
//            System.out.println(i);
        }

        visit = new boolean[node+1];
        dfs(start);
        System.out.printf("\n");

        visit = new boolean[node+1];
        bfs(start);
    }

    public static void dfs(int idx) {
        if(visit[idx]) return;
        visit[idx] = true;
        System.out.printf("%d ", idx);
        for (int i=0;i<A[idx].size();i++){
            dfs(A[idx].get(i));
        }
    }

    public static void bfs(int idx) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(idx);
        int preNode;
        while(!queue.isEmpty()) {
            preNode = queue.pop();
            visit[preNode] = true;
            System.out.printf("%d ", preNode);
            for (int i=0;i<A[preNode].size();i++){
                if (!visit[A[preNode].get(i)]) {
                    queue.add(A[preNode].get(i));
                    visit[A[preNode].get(i)] = true;
                }
            }
        }
    }
}