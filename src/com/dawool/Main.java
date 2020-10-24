package com.dawool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    static boolean[][] done;
    private static void solution(int sizeOfMatrix, int[][] matrix) {
        // TODO: 이곳에 코드를 작성하세요.
        done = new boolean[sizeOfMatrix][sizeOfMatrix];

        int count = 0;
        List<Integer> sizeOfT = new ArrayList<>();

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                if (matrix[i][j] == 1 && !done[i][j]) {
                    sizeOfT.add(search(i, j, matrix));
                    count++;
                }
            }
        }

        Collections.sort(sizeOfT);
        StringBuilder sb = new StringBuilder();
        sb.append(count);
        sb.append('\n');
        for (int i = 0; i < sizeOfT.size(); i++) {
            sb.append(sizeOfT.get(i) + " ");
        }
        System.out.println(sb);
    }

    private static int search(int i, int j, int[][] matrix) {
        if (matrix[i][j] == 0 || done[i][j]) {
            done[i][j] = true;
            return 0;
        }

        done[i][j] = true;
        int ans = 1;
        if (i > 0) {
            ans += search(i - 1, j, matrix);
        }
        if (j > 0) {
            ans += search(i, j - 1, matrix);
        }
        if (i < matrix.length - 1) {
            ans += search(i + 1, j, matrix);
        }
        if (j < matrix.length - 1) {
            ans += search(i, j + 1, matrix);
        }

        return ans;
    }

    private static class InputData {
        int sizeOfMatrix;
        int[][] matrix;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.sizeOfMatrix = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.matrix = new int[inputData.sizeOfMatrix][inputData.sizeOfMatrix];
            for (int i = 0; i < inputData.sizeOfMatrix; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.sizeOfMatrix; j++) {
                    inputData.matrix[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.sizeOfMatrix, inputData.matrix);
    }
}