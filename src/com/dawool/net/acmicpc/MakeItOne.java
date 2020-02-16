package com.dawool.net.acmicpc;

import java.util.LinkedList;
import java.util.Scanner;
//https://www.acmicpc.net/problem/1463
public class MakeItOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int targetNum = sc.nextInt();

        if (targetNum == 1) {
            System.out.println(0);
            return;
        }

        LinkedList<Integer> numbers = new LinkedList<>();
        int[] minRoute = new int[targetNum + 1];
        numbers.add(targetNum);

        int preNum, preRoute;
        while (minRoute[1] == 0) {
            preNum = numbers.pop();
            preRoute = minRoute[preNum];
            if (preNum % 3 == 0) {
                if (minRoute[preNum / 3] == 0) minRoute[preNum / 3] = preRoute + 1;
                else minRoute[preNum / 3] = Math.min(minRoute[preNum / 3], preRoute + 1);
                numbers.add(preNum / 3);
            }
            if (preNum % 2 == 0) {
                if (minRoute[preNum / 2] == 0) minRoute[preNum / 2] = preRoute + 1;
                else minRoute[preNum / 2] = Math.min(minRoute[preNum / 2], preRoute + 1);
                numbers.add(preNum / 2);
            }
            if (minRoute[preNum - 1] == 0) minRoute[preNum - 1] = preRoute + 1;
            else minRoute[preNum - 1] = Math.min(minRoute[preNum - 1], preRoute + 1);
            numbers.add(preNum - 1);
        }
        System.out.println(minRoute[1]);
    }
}
