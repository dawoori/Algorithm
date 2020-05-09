package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        while(number != 0) {
            int lengthOfNumber = (int) Math.log10(number) + 1;
            int[] numbers = new int[lengthOfNumber];

            for (int i = 0; i < lengthOfNumber; i++) {
                numbers[i] = number;
            }
            number = Integer.parseInt(br.readLine());
        }
    }

    public static int getNumber(int number, int index) {
        return (int) (number / Math.pow(number, index));
    }
}
