package com.dawool;

import java.util.Arrays;

public class dfs {
    static final int[] weight = {3, 4, 1, 2, 3};
    static final int[] value = {2, 3, 2, 3, 6};
    static boolean[] isInTheBag = new boolean[weight.length];

    static int dfs(int nowh, int noww) {

        return dfs(nowh + 1, noww) + dfs(nowh, noww + 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < weight.length + 1; i++) {
            for (int j = 0; j < i; j++) {
                isInTheBag[j] = true;
            }
            for (int k = i + 1; k < weight.length; k++) {
                isInTheBag[k] = false;
            }
            System.out.println(Arrays.toString(isInTheBag));
        }
    }
}
