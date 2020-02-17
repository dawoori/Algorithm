package com.dawool;

import java.util.Arrays;
import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.dp();
        System.out.println(Arrays.toString(knapsack.dp[0]));
        System.out.println(Arrays.toString(knapsack.dp[1]));
        System.out.println(Arrays.toString(knapsack.dp[2]));
        System.out.println(Arrays.toString(knapsack.dp[3]));
        System.out.println(Arrays.toString(knapsack.dp[4]));
        System.out.println(Arrays.toString(knapsack.dp[5]));
    }
}