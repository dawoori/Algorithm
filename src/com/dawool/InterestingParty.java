package com.dawool;

import java.util.ArrayList;
import java.util.Arrays;

public class InterestingParty {
    public static int bestInvitation(String[] first, String[] second) {
        ArrayList<String> every = new ArrayList<>();
        for (int i=0;i<first.length;i++) {
            if (!every.contains(first[i])) {
                every.add(first[i]);
            }
        }
        for (int i=0;i<second.length;i++) {
            if (!every.contains(second[i])) {
                every.add(second[i]);
            }
        }

        int[] answer = new int[every.size()];
        for (int i=0;i<answer.length;i++) answer[i]=0;

        for (int i=0;i<every.size();i++) {
            String interT = every.get(i);
            for (int j=0;j<first.length;j++) {
                if (first[j].equals(interT)||second[j].equals(interT)) answer[i]++;
            }
        }
        Arrays.sort(answer);
        return answer[answer.length-1];
    }
}
