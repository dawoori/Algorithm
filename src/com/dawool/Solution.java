package com.dawool;

import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(String arrangement) {
        int answer = 0;
//        ()(((()())(())()))(())
        Stack<Integer> pipes = new Stack<>();

        for (int i = 0; i < arrangement.length(); i++) {
            if (arrangement.charAt(i) == '(' && arrangement.charAt(i + 1) == ')') {
//                razer
                for (int j = 0; j < pipes.size(); j++) {
                    pipes.set(j, pipes.get(j) + 1);
                }
                i++;
            } else if (arrangement.charAt(i) == '(') {
//                open
                pipes.push(1);
            } else {
//                close
                answer += pipes.pop();
            }
        }

        return answer;
    }
}