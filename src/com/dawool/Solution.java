package com.dawool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;
        int answer = 0;

        ArrayList<String> caches = new ArrayList<>();

        int fullCacheIndex = 0;

        for (int i = 0; i < cities.length; i++) {
            if (caches.contains(cities[i].toLowerCase())) {
                answer += 1;
                caches.remove(cities[i].toLowerCase());
                caches.add(cities[i].toLowerCase());
            } else {
                answer += 5;
                caches.add(cities[i].toLowerCase());
            }
            if (caches.size() == cacheSize) {
                fullCacheIndex = i;
                break;
            }
        }

        for (int i = fullCacheIndex + 1; i < cities.length; i++) {
            if (caches.contains(cities[i].toLowerCase())) {
                answer += 1;
                caches.remove(cities[i].toLowerCase());
                caches.add(cities[i].toLowerCase());
            } else {
                answer += 5;
                caches.remove(0);
                caches.add(cities[i].toLowerCase());
            }
        }

        return answer;
    }
}