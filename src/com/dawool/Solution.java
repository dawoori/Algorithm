package com.dawool;

class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder stringBuilder = new StringBuilder("");
        int left = -1;
        int right = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                left = numbers[i];
                stringBuilder.append("L");
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                right = numbers[i];
                stringBuilder.append("R");
            } else {
                if (distance(left, numbers[i]) == distance(right, numbers[i])) {
                    if (hand.equals("left")) {
                        left = numbers[i];
                        stringBuilder.append("L");
                    } else {
                        right = numbers[i];
                        stringBuilder.append("R");
                    }
                } else if (distance(left, numbers[i]) < distance(right, numbers[i])) {
                    left = numbers[i];
                    stringBuilder.append("L");
                } else {
                    right = numbers[i];
                    stringBuilder.append("R");
                }
            }
        }
        return stringBuilder.toString();
    }

    public int distance(int hand, int pad) {
        if (pad == 2) {
            if (hand == 2) return 0;
            else if (hand == 1 || hand == 3 || hand == 5) return 1;
            else if (hand == 4 || hand == 6 || hand == 8) return 2;
            else if (hand == 7 || hand == 9 || hand == 0) return 3;
            else return 4;
        } else if (pad == 5) {
            if (hand == 5) return 0;
            else if (hand == 4 || hand == 6 || hand == 2 || hand == 8) return 1;
            else if (hand == 1 || hand == 3 || hand == 0 || hand == 7 || hand == 9) return 2;
            else return 3;
        } else if (pad == 8) {
            if (hand == 8) return 0;
            else if (hand == 1 || hand == 3) return 3;
            else if (hand == 4 || hand == 6 || hand == 2 || hand == -1) return 2;
            else return 1;
        } else {
            if (hand == 1 || hand == 3) return 4;
            else if (hand == 4 || hand == 6 || hand == 2) return 3;
            else if (hand == 7 || hand == 9 || hand == 5) return 2;
            else return 1;
        }
    }
}