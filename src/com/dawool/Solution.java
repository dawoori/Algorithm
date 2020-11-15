package com.dawool;

import java.util.*;

class Solution {
    ArrayList<ArrayList<Integer>> route = new ArrayList<>();
    int maxCookies = 0;
    int[] dp;
    public int[] solution(int[] cookies, int k) {
        dp = new int[cookies.length];

        for (int cs = 1; cs < cookies.length; cs++) {
            dp[cs] = 1;
            for (int dps = cs - 1; dps >= 0; dps--) {
                if (cookies[cs] > cookies[dps]) {
                    dp[cs] = Math.max(dp[cs], dp[dps] + 1);
                }
            }
        }

        for (int i = 0; i < cookies.length; i++) {
            maxCookies = Math.max(maxCookies, dp[i]);
        }

        for (int i = 0; i < cookies.length; i++) {
            if (dp[i] == maxCookies) {
                ArrayList<Integer> tempRoute = new ArrayList<>();
                dfs2(cookies, i, tempRoute, 1);
            }
        }

        Collections.sort(route, (integers, t1) -> {
            for (int i = 0; i < integers.size(); i++) {
                if (integers.get(i).compareTo(t1.get(i)) != 0) {
                    return integers.get(i).compareTo(t1.get(i));
                }
            }
            return 0;
        });

        int[] answer = route.get(k - 1).stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }

    void dfs2(int[] cookies, int idx, List<Integer> recentRoute, int depth) {
        List<Integer> newRoute = new ArrayList<>(recentRoute);
        newRoute.add(cookies[idx]);
        if (depth == maxCookies) {
            Collections.reverse(newRoute);
            route.add((ArrayList<Integer>) newRoute);
            return;
        }
        for (int i = idx - 1; i >= 0; i--) {
            if (cookies[i] < cookies[idx] && dp[i] + depth == maxCookies) {
                dfs2(cookies, i, newRoute, depth + 1);
            }
        }
    }
}