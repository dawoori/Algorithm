package com.dawool;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int remove = k;

        int startIndex = -1;
        while (remove > 0) {
            int largestNumber = 0;
            int topIndex = -1;
            for (int num = startIndex + 1; num <= startIndex + remove + 1; num++) {
                if (number.charAt(num) > largestNumber) {
                    largestNumber = number.charAt(num);
                    topIndex = num;
                }
            }
            remove -= topIndex - startIndex - 1;
            startIndex = topIndex;
            answer += (char) largestNumber;
            if (answer.length() >= number.length() - k) return answer;
        }
        answer += number.substring(Math.min(startIndex + 1, number.length()));

        return answer;
    }
}