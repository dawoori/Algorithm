package com.dawool;


public class CrazyBot {

    boolean[][] grid = new boolean[30][30];
    int[] vx = new int[]{1, -1, 0, 0};
    int[] vy = new int[]{0, 0, -1, 1};
    double[] prob = new double[4];

    public double getProbability(int n, int east, int west, int south, int north) {
        prob[0] = (double) east / 100;
        prob[1] = (double) west / 100;
        prob[2] = (double) south / 100;
        prob[3] = (double) north / 100;
        return dfs(15, 15, n);
    }

    double dfs(int x, int y, int n) {
        if (grid[x][y]) return 0;
        if (n == 0) return 1;

        grid[x][y] = true;

        double ret = 0;
        for (int i = 0; i < 4; i++) {
            ret += dfs(x + vx[i], y + vy[i], n - 1) * prob[i];
        }

        grid[x][y] = false;

        return ret;
    }
}