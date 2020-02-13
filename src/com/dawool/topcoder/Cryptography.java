package com.dawool.topcoder;

import java.util.Arrays;

public class Cryptography {
    public long encrypt(int[] numbers) {
        int[] numTemp = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(numTemp);
        numTemp[0]++;
        System.out.println(Arrays.toString(numTemp));
        long answer = 1;
        for (int num : numTemp) {
            answer *= num;
        }
        return answer;
    }
}
