package com.dawool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();
        String[] board = new String[height];

        ArrayList<Character> visited = new ArrayList<>();
        int[][] visitedXY = new int[height][width];

        for (int i = 0; i < height; i++) {
            board[i] = sc.next();
        }
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        int max = 0;
        int[] prenode;
        while (!queue.isEmpty()) {

            prenode = queue.pop();
            visited.add(board[prenode[0]].charAt(prenode[1]));
            max++;
            visitedXY[prenode[0]][prenode[1]] = Math.max(max, visitedXY[prenode[0]][prenode[1]]);

            if(prenode[0] > 0 && visited.indexOf(board[prenode[0]-1].charAt(prenode[1])) == -1) queue.add(new int[]{prenode[0] - 1, prenode[1]});
            if(prenode[0] < height-1 && visited.indexOf(board[prenode[0]+1].charAt(prenode[1])) == -1) queue.add(new int[]{prenode[0] + 1, prenode[1]});
            if(prenode[1] > 0 && visited.indexOf(board[prenode[0]].charAt(prenode[1]-1)) == -1) queue.add(new int[]{prenode[0], prenode[1] - 1});
            if(prenode[1] < width-1 && visited.indexOf(board[prenode[0]].charAt(prenode[1]+1)) == -1) queue.add(new int[]{prenode[0], prenode[1] + 1});
//
        }
        System.out.println(max);
    }
}