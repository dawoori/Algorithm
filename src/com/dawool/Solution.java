package com.dawool;

class Solution {
    boolean[][] visited;
    char[][] direction;
    int[][] prop = new int[][]{{100, 500}, {100, 500}};
    int[] vx = new int[]{1, -1, 0, 0};
    int[] vy = new int[]{0, 0, -1, 1};

    public int solution(int[][] board) {
        int numberN = board.length;
        visited = new boolean[numberN][numberN];
        int answer = Math.min(dfs(1, 0, 0, board), dfs(0, 1, 1, board));
        return answer;
    }

    public int dfs(int iCor, int jCor, int dir, int[][] board) { // i 방향: 0, j 방향: 1
        if (visited[iCor][jCor] || board[iCor][jCor] == 1) return 0;

        visited[iCor][jCor] = true;
        int ret = 0;
        if (iCor < board.length - 2) ret = dfs(iCor + 1, jCor, 0, board) + prop[dir][0];
        if (iCor > 1) ret += dfs(iCor - 1, jCor, 0, board) + prop[dir][0];
        if (jCor < board.length - 2) ret += dfs(iCor, jCor + 1, 1, board) + prop[dir][1];
        if (jCor > 1) ret += dfs(iCor, jCor - 1, 1, board) + prop[dir][1];

        visited[iCor][jCor] = false;

        return ret + 200;
    }
}