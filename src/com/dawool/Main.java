package com.dawool;

import java.io.*;

public class Main{
    public static void main(String[] args) {
        MazeMaker mazeMaker = new MazeMaker();
        String[] maze = new String[]{"...","...","..."};
        int sR = 0;
        int sC = 1;
        int[] mR = {1,0,-1,0};
        int[] mC = {0,1,0,-1};
//        System.out.println(mR[3]);
        System.out.println(mazeMaker.longestPath(maze,sR,sC,mR,mC));
    }
}