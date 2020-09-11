package com.dawool;

import java.util.Arrays;

class Solution {
    public int solution(int[][] a) {
        int answer = -1;
        int[] oneOfCol = new int[a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j] == 1) oneOfCol[j]++;
            }
        }

        System.out.println(Arrays.toString(oneOfCol));

        return answer;
    }
}