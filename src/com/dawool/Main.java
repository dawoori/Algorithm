package com.dawool;

import java.util.Scanner;

class Main {
    private static void solution(int day, int width, int[][] blocks) {
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.
        int[] blockState = new int[width];
        int answer = 0;

        for (int d = 0; d < day; d++) {
            for (int b = 0; b < width; b++) {
                blockState[b] += blocks[d][b];
            }

            int left = 0;
            int right = 0;
            for (int i = 1; i < width; i++) {
                if (blockState[i] < blockState[i - 1]) {
                    break;
                }
                left = i;
                right = i;
            }

            for (int block = 1; block < width; block++) {
                if (blockState[block] > blockState[block - 1]) {
                    right = block;
                    for (int j = left + 1; j < right; j++) {
                        answer += Math.min(blockState[left], blockState[right]) - blockState[j];
                        blockState[j] += Math.min(blockState[left], blockState[right]) - blockState[j];
                    }
                } else {
                    left = right;
                }
            }
        }

        System.out.println(answer);
    }

    private static class InputData {
        int day;
        int width;
        int[][] blocks;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.day = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.width = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.blocks = new int[inputData.day][inputData.width];
            for (int i = 0; i < inputData.day; i++) {
                String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
                for (int j = 0; j < inputData.width; j++) {
                    inputData.blocks[i][j] = Integer.parseInt(buf[j]);
                }
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.day, inputData.width, inputData.blocks);
    }
}