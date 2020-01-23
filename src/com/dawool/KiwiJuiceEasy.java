package com.dawool;

import java.util.Arrays;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) { //min 이용
        int[] answer = Arrays.copyOf(bottles, bottles.length);
        int M = fromId.length;
        for (int i = 0; i < M; i++) {
            int from = fromId[i];
            int to = toId[i];
            if (!(answer[from] == 0 || answer[to] >= capacities[to])) {
                int left = capacities[to] - answer[to];
                int volume = Math.min(left, bottles[from]);
                bottles[from] -= volume;
                bottles[to] += volume;
            }
        }
        return answer;
    }
}
