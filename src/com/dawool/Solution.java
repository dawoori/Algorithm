package com.dawool;

import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        return paper(n);
    }

    public int[] paper(int n) {
        if (n == 1) return new int[]{0};

        int[] left = paper(n - 1);
        int[] right = Arrays.copyOf(left, left.length);

        right[(right.length + 1) / 2 - 1] = 1;

        int[] answer = new int[1 + left.length * 2];

        System.arraycopy(left, 0, answer, 0, left.length);
        System.arraycopy(right, 0, answer, left.length + 1, left.length);

        return answer;
    }
}