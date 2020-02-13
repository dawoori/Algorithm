package com.dawool.topcoder;

public class ThePalindrome {
    public int find(String s) {
        int lengthOfS = s.length();
        int answer = lengthOfS;
        for (int i = 0; i < lengthOfS; i++) {
            boolean isPalindrome = true;
            for (int j = i; j < (lengthOfS - i) / 2 + i; j++) {
                if (s.charAt(j) != s.charAt(lengthOfS - j + i - 1)) {
                    isPalindrome = false;
                    answer++;
                    break;
                }
            }
            if (isPalindrome) break;
        }

        return answer;
    }
}
