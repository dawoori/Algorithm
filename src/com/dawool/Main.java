package com.dawool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.dp();
        System.out.println(knapsack.maxValue);
        int[] arr = {1, 4, 2, 9, 5};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}