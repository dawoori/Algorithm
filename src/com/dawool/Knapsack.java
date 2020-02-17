package com.dawool;

public class Knapsack {
    int[] weight = {3, 4, 1, 2, 3};
    int[] value = {2, 3, 2, 3, 6};
    int maxWeight = 10;
    int maxValue = 0;

    void knapsack(int n, int w, int p) {
        if (w > maxWeight) return;
        maxValue = Math.max(maxValue, p);
        if (n >= weight.length) return;
        knapsack(n + 1, w, p);
        knapsack(n + 1, w + weight[n], p + value[n]);
    }
}
