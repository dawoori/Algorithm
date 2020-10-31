package com.dawool;

class Solution {
    public String solution(int n, int[][] delivery) {
        char[] answerChar = new char[n];

        for (int i = 0; i < n; i++) {
            answerChar[i] = '?';
        }
        for (int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 1) {
                answerChar[delivery[i][0] - 1] = 'O';
                answerChar[delivery[i][1] - 1] = 'O';
            }
        }
        for (int i = 0; i < delivery.length; i++) {
            if (delivery[i][2] == 0) {
                if (answerChar[delivery[i][0] - 1] == 'O' && answerChar[delivery[i][1] - 1] == '?') {
                    answerChar[delivery[i][1] - 1] = 'X';
                } else if (answerChar[delivery[i][0] - 1] == '?' && answerChar[delivery[i][1] - 1] == 'O') {
                    answerChar[delivery[i][0] - 1] = 'X';
                }
            }
        }

        String answer = new String(answerChar);

        return answer;
    }
}