package com.dawool;

class Solution {
    boolean[][] searched;

    public int[] solution(int[][] v) {
        searched = new boolean[v.length][v[0].length];
        int[] answer = new int[3];

        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[0].length; j++) {
                int a = search(i, j, v, v[i][j]);
                if (a > 0) {
                    answer[v[i][j]]++;
                }
            }
        }
        return answer;
    }

    public int search(int i, int j, int[][] v, int vegie) {
        if (i < 0 || j < 0 || i >= v.length || j >= v.length || searched[i][j] || v[i][j] != vegie) {
            return 0;
        }
        searched[i][j] = true;
        return 1 + search(i + 1, j, v, vegie)
                + search(i, j + 1, v, vegie)
                + search(i - 1, j, v, vegie)
                + search(i, j - 1, v, vegie);
    }
}