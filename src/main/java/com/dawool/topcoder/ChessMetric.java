package com.dawool.topcoder;

public class ChessMetric {
    public long howMany(int size, int[] start, int[] end, int numMoves) {
        int[] dx = new int[]{0, 1, 1, 1, 0, -1, -1, -1, 2, 1, -1, 2, -2, -1, 1, -2};
        int[] dy = new int[]{1, 1, 0, -1, -1, -1, 0, 1, 1, 2, 2, -1, -1, -2, -2, 1};
        long[][][] routes = new long[size][size][numMoves + 1];
        int sx = start[0], sy = start[1], ex = end[0], ey = end[1];

        routes[sx][sy][0] = 1;

        for (int i = 1; i < numMoves + 1; i++) {
            for (int x = 0; x < size; x++) {
                for (int y = 0; y < size; y++) {
                    for (int j = 0; j < dx.length; j++) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];
                        if (nx < 0 || ny < 0 || nx >= size || ny >= size) continue;
                        routes[nx][ny][i] += routes[x][y][i - 1];
                    }
                }
            }
        }

        return routes[ex][ey][numMoves];
    }
}
