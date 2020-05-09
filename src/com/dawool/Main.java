package com.dawool;

class Main {

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();

        int solution1 = solution.solution(new int[][] {{0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 0}, {0, 0, 1, 0, 0, 0}, {1, 0, 0, 1, 0, 1}, {0, 1, 0, 0, 0, 1}, {0, 0, 0, 0, 0, 0}});
        System.out.println(solution1);
    }
}