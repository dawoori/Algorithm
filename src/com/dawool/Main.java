package com.dawool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(10000));
//            list.add(i);
        }
        int[] b = list.stream().mapToInt(Integer::intValue).toArray();
        int[] ans = solution.solution(b, 1);
        System.out.println(Arrays.toString(ans));

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