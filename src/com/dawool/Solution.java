package com.dawool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    List<int[]> possible = new ArrayList<>();

    public int solution(int[][] board) {
        int answer = 0;

        int n = board.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        permute(arr, output, visited, 0);

        for (int i = 0; i < possible.size(); i++) {
            int[] batch = possible.get(i);
            int tempAnswer = 0;
            for (int row = 0; row < n; row++) {
                tempAnswer += board[row][batch[row]];
            }
            answer = Math.max(answer, tempAnswer);
        }
        return answer;
    }

    void permute(int[] arr, int[] output, boolean[] visited, int depth) {
        if (depth == arr.length) {
            possible.add(Arrays.copyOf(output, output.length));
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output[depth] = arr[i];
                permute(arr, output, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}