package com.dawool;

import java.util.*;

class Solution {
    public int solution(int n, int[][] groups) {
        int answer = 0;

        Map<Integer, Integer> lamp = new HashMap<>();
        for (int i = 0; i < groups.length; i++) {
            for (int j = groups[i][0]; j < groups[i][1] + 1; j++) {
                int value = 1;
                if (lamp.containsKey(j)) value += lamp.get(j);
                lamp.put(j, value);
            }
        }

        List<Integer> list = new ArrayList<>(lamp.values());
        int minTimes = Collections.min(list);

        for (int i = 0; i < groups.length; i++) {
            boolean inner = true;
            for (int j = groups[i][0]; j < groups[i][1] + 1; j++) {
                if (lamp.containsKey(j) && lamp.get(j) == 1) {
                    inner = false;
                    break;
                }
            }

            if (!inner) answer++;
        }

        answer += (n - lamp.size());

        return answer;
    }
}