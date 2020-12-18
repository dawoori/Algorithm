//https://www.acmicpc.net/problem/2579
package com.dawool.net.acmicpc;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class StepUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stepNumber = sc.nextInt();

        int[] score = new int[stepNumber + 1];
        int[] maxScore = new int[stepNumber + 1];
        int[] howManyOne = new int[stepNumber + 1];

        for (int i = 0; i < stepNumber; i++) {
            score[i + 1] = sc.nextInt();
        }

        LinkedList<Integer> visited = new LinkedList<>();
        visited.add(0);
        int preStep;
        
        while (!visited.isEmpty()) {
            preStep = visited.pop();
            if (preStep + 2 <= stepNumber) {
                if (preStep + 3 <= stepNumber) {
                    visited.add(preStep + 3);
                    maxScore[preStep + 3] = Math.max(maxScore[preStep] + score[preStep + 2] + score[preStep + 3], maxScore[preStep + 3]);
                    howManyOne[preStep + 3] = 2;
                }
                if (maxScore[preStep + 2] < maxScore[preStep] + score[preStep + 2]) {
                    visited.add(preStep + 2);
                    maxScore[preStep + 2] = maxScore[preStep] + score[preStep + 2];
                    howManyOne[preStep + 2] = 1;
                }
            }
            if (preStep + 1 <= stepNumber && howManyOne[preStep] < 2 && maxScore[preStep + 1] < maxScore[preStep] + score[preStep + 1]) {
                visited.add(preStep + 1);
                maxScore[preStep + 1] = maxScore[preStep] + score[preStep + 1];
                howManyOne[preStep + 1] = howManyOne[preStep] + 1;
            }
        }
        System.out.println(maxScore[stepNumber]);
    }
}
