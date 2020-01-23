package com.dawool;

import java.util.ArrayList;

public class InterestingDigits {
    public int[] digits(int base) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int ans = 2; ans < base; ans++) {
            boolean isOk = true;
            System.out.println(ans);
            for (int i = 0; i < base; i++) {
                for (int j = 0; j < base; j++) {
                    for (int k = 0; k < base; k++) {
                        if ((i * base * base + j * base + k) % ans == 0 && (i + j + k) % ans != 0) {
                            isOk = false;
                            break;
                        }
                    }
                    if (!isOk) break;
                }
                if (!isOk) break;
            }
            System.out.println(isOk);
            if (isOk) answer.add(ans);
        }
        System.out.println(answer);
        int[] realAnswer = new int[answer.size()];
        for (int i = 0; i < realAnswer.length; i++) {
            realAnswer[i] = answer.get(i);
        }
        return realAnswer;
    }
}
