package com.dawool;

class Solution {
    public int solution(int[] openA, int[] closeB) {
        int answer = 0;
        int closeMemory = 0;
        boolean[] time = new boolean[closeB[closeB.length - 1]];

        for (int open = 0; open < openA.length; open++) {
            for (int close = closeMemory; close < closeB.length; close++) {
                if (openA[open] < closeB[close]) {
                    for (int i = openA[open]; i < closeB[close]; i++) {
                        time[i] = true;
                    }
                    closeMemory = close;
                    break;
                }
            }

        }

        for (int i = 0; i < time.length; i++) {
            if (time[i]) answer++;
        }
        return answer;
    }
}