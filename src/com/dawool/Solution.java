package com.dawool;

class Solution {
    public int solution(String depar, String hub, String dest, String[][] roads) {
        int answer = navigation(depar, hub, roads) * navigation(hub, dest, roads);
        return answer;
    }

    public int navigation(String now, String dest, String[][] roads) {
        if (now.equals(dest)) return 1;

        int count = 0;
        for (int i = 0; i < roads.length; i++) {
            if(roads[i][0].equals(now)) {
                count += navigation(roads[i][1], dest, roads);
            }
        }

        return count;
    }
}