package com.dawool;

public class FriendScore {
    public int highestScore(String[] friends) {
        int answer = 0;
        for (int i = 0; i < friends.length; i++) {
            int score = 0;
            for (int j = 0; j < friends.length; j++) {
                if (friends[i].charAt(j) == 'Y') score++;
                else if (i != j) {
                    for (int k = 0; k < friends.length; k++) {
                        if (friends[i].charAt(k) == 'Y' && friends[j].charAt(k) == 'Y') {
                            score++;
                            break;
                        }
                    }
                }
            }
            answer = Math.max(answer, score);
        }
        return answer;
    }
}