package com.dawool;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][] {{0,0,1,1},{1,1,1,1},{2,2,2,1},{0,0,0,2}}	;
        int[] arrA = solution.solution(arr);
        System.out.println(Arrays.toString(arrA));
    }
}