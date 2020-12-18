package com.dawool.net.acmicpc;

//https://www.acmicpc.net/problem/1019

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class BookPage {
    static long[] howMany = new long[10];

    public static void main(String[] args) throws IOException {
        long start = 1;
        long ten = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long end = Integer.parseInt(br.readLine());

        while (start <= end) {
            while (start % 10 != 0 && start <= end) {
                calc(start, ten);
                start++;
            }
            if (start > end) break;

            while (end % 10 != 9 && start <= end) {
                calc(end, ten);
                end -= 1;
            }
            long cnt = end / 10 - start / 10 + 1;
            for (int i = 0; i < 10; i++) {
                howMany[i] += cnt*ten;
            }

            start /= 10;
            end /= 10;
            ten *= 10;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", howMany[i]);
        }
    }

    public static void calc(long n, long ten) {
        while (n > 0) {
            howMany[(int) (n % 10)] += ten;
            n /= 10;
        }
    }
}