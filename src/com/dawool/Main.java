package com.dawool;

import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();
        if (inputN == 0) {
            System.out.println(0);
            return;
        } else if (inputN == 1) {
            System.out.println(1);
            return;
        }

        long tempNum;
        long num1 = 1;
        long num2 = 1;
        for (int i = 0; i < inputN - 2; i++) {
            tempNum = num2;
            num2 += num1;
            num1 = tempNum;
        }
        System.out.println(num2);
    }
}