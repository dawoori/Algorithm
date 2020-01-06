package com.dawool;

import java.util.Arrays;

public class KiwiJuiceEasy {
    public int[] thePouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {
        int[] answer = Arrays.copyOf(bottles, bottles.length);
        int M = fromId.length;
        int left;
        for (int i=0;i<M;i++){
            if (!(answer[fromId[i]]==0||answer[toId[i]]>=capacities[toId[i]])){
                left = capacities[toId[i]] - answer[toId[i]];
                if (left>answer[fromId[i]]) {
                    answer[toId[i]] += answer[fromId[i]];
                    answer[fromId[i]] = 0;
                }
                else {
                    answer[toId[i]] = capacities[toId[i]];
                    answer[fromId[i]] -= left;
                }
            }
        }
        return answer;
    }
}
