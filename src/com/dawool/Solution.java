package com.dawool;

import java.util.HashMap;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> nam = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            int alr = 0;
            String par = participant[i];
            if (nam.containsKey(par)) alr = nam.get(par);
            nam.put(par, alr);
        }
        for (int i = 0; i < completion.length; i++) {
            nam.put(completion[i], nam.get(completion[i]) - 1);
        }
        for (String key : nam.keySet()) {
            if (nam.get(key) == 1) return key;
        }
        return "";
    }
}