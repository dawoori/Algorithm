package com.dawool;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Knapsack knapsack = new Knapsack();
        knapsack.knapsack(0,0,0);
        System.out.println(knapsack.maxValue);
    }
}