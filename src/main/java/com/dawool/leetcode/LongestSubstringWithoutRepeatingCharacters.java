package com.dawool.leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int answer = 0;
        int tempAnswer = 0;
        HashMap<Character, Integer> charIndex = new HashMap<>();

        int index = 0;
        while (index < s.length()) {
            if (charIndex.containsKey(s.charAt(index))) {
                answer = Math.max(answer, tempAnswer);
                index = charIndex.get(s.charAt(index)) + 1;

                charIndex = new HashMap<>();
                tempAnswer = 0;
            }
            tempAnswer++;
            charIndex.put(s.charAt(index), index);
            index++;
        }

        answer = Math.max(answer, tempAnswer);
        return answer;
    }
}
