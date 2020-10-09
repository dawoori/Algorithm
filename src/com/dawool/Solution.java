package com.dawool;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int n) {
        int answer = 0;

        int ternary = 3;

        Deque<Integer> stack = new ArrayDeque<>();

        while(true) {
            stack.push(n % ternary);
            n = n / ternary;
            if (n == 0) {
                break;
            }
        }

        int number = 0;
        int digit = 0;

        while(!stack.isEmpty()) {
            int k = stack.removeFirst() * (int) Math.pow(10, digit);
            number += k;
            System.out.println(k);
            digit++;
        }

        return answer;
    }
}