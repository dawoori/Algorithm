package com.dawool;

import java.util.Arrays;

public class dfs {
    static final int[] weight = {3, 4, 1, 2, 3};
    static final int[] value = {2, 3, 2, 3, 6};
    static final int weightLimit = 10;
    static boolean[] isInTheBag = new boolean[weight.length];
    static int maxValue;

    static void dfs(int wei) {
        if (wei < weight.length) {
            isInTheBag[wei] = false;
            dfs(wei + 1);
            isInTheBag[wei] = true;
            dfs(wei + 1);
        } else {
            int sumOfWeight = 0;
            int sumOfValue = 0;
            for (int i = 0; i < weight.length; i++) {
                if (isInTheBag[i]) sumOfWeight += weight[i];
                if (isInTheBag[i]) sumOfValue += value[i];
            }
            if (sumOfWeight <= weightLimit) {
                maxValue = Math.max(maxValue, sumOfValue);
                System.out.println(Arrays.toString(isInTheBag));
                System.out.println(maxValue);
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);

        System.out.println(maxValue);
    }
}
