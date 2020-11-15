package com.dawool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        int[][] a = new int[][]{{3, 6, 8},{1, 4, 7},{2, 1, 4}};
        int[] b = new int[]{4, 10, 12};
        solution.solution(a);

        List<int[]> list = new ArrayList<>(0);
        list.add(new int[]{1, 2, 3});
        list.add(new int[]{1, 3, 2});

    }

    static void perm(int[] arr, int[] output, boolean[] visited, int depth) {
        if (depth == arr.length) {
            System.out.println(Arrays.toString(output));
            return;
        }

        for (int i=0; i<arr.length; i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                perm(arr, output, visited, depth + 1);
                visited[i] = false;
            }
        }
    }
}