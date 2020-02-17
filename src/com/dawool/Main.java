package com.dawool;

import java.util.Arrays;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        int[][] triangle = {{1}, {1, 2}, {1, 2, 3}};
        System.out.println(triangle.length);
        System.out.println(triangle[0].length);
        System.out.println(triangle[1].length);
        System.out.println(triangle[2].length);

        System.out.println(Arrays.toString(triangle[0]));
        System.out.println(Arrays.toString(triangle[1]));
        System.out.println(Arrays.toString(triangle[2]));

        Knapsack knapsack = new Knapsack();

        System.out.println(knapsack.knapsack(0, 0));
    }
}