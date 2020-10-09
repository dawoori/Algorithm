package com.dawool;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;

class Main {
    public static void main(String[] args) {

        int n = 45;
        int m = 3;

        Deque<Integer> stack = new ArrayDeque<>();

        while(true) {
            stack.push(n % m);
            n = n / m;
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

        System.out.println(number);
        System.out.println(Math.pow(10, 2));
    }
}