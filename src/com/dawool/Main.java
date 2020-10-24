package com.dawool;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    private static void solution(int numOfAllPlayers, int numOfQuickPlayers, char[] namesOfQuickPlayers, int numOfGames, int[] numOfMovesPerGame) {
        // TODO: 이곳에 코드를 작성하세요. 추가로 필요한 함수와 전역변수를 선언해서 사용하셔도 됩니다.\
        char[] players = new char[numOfAllPlayers - 1];
        char tagger = 'A';
        int towelIndex = 0;
        Map<Character, Integer> count = new HashMap();
        count.put('A', 1);
        for (int i = 0; i < numOfAllPlayers - 1; i++) {
            players[i] = (char) (i + 66);
        }

        for (int game = 0; game < numOfGames; game++) {
            towelIndex += numOfMovesPerGame[game];
            boolean taggerChange = true;

            while (towelIndex < 0 || towelIndex >= numOfAllPlayers - 1) {
                if (towelIndex < 0) {
                    towelIndex += numOfAllPlayers - 1;
                } else if (towelIndex >= numOfAllPlayers) {
                    towelIndex -= numOfAllPlayers - 1;
                }
            }

            for (int quick = 0; quick < numOfQuickPlayers; quick++) {
                if (players[towelIndex] == namesOfQuickPlayers[quick]) {
                    taggerChange = false;
                    break;
                }
            }

            if (taggerChange) {
                char tempTagger;
                tempTagger = players[towelIndex];
                players[towelIndex] = tagger;
                tagger = tempTagger;
            }

            int cnt = 1;
            if (count.containsKey(tagger)) {
                cnt += count.get(tagger);
            }

            count.put(tagger, cnt);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numOfAllPlayers - 1; i++) {
            int ans = 0;
            if (count.containsKey(players[i])) {
                ans = count.get(players[i]);
            }
            sb.append(players[i]);
            sb.append(" ");
            sb.append(ans);
            sb.append('\n');
        }
        sb.append(tagger);
        sb.append(" ");
        sb.append(count.get(tagger));

        System.out.println(sb);
    }

    private static class InputData {
        int numOfAllPlayers;
        int numOfQuickPlayers;
        char[] namesOfQuickPlayers;
        int numOfGames;
        int[] numOfMovesPerGame;
    }

    private static InputData processStdin() {
        InputData inputData = new InputData();

        try (Scanner scanner = new Scanner(System.in)) {
            inputData.numOfAllPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));

            inputData.numOfQuickPlayers = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.namesOfQuickPlayers = new char[inputData.numOfQuickPlayers];
            System.arraycopy(scanner.nextLine().trim().replaceAll("\\s+", "").toCharArray(), 0, inputData.namesOfQuickPlayers, 0, inputData.numOfQuickPlayers);

            inputData.numOfGames = Integer.parseInt(scanner.nextLine().replaceAll("\\s+", ""));
            inputData.numOfMovesPerGame = new int[inputData.numOfGames];
            String[] buf = scanner.nextLine().trim().replaceAll("\\s+", " ").split(" ");
            for (int i = 0; i < inputData.numOfGames; i++) {
                inputData.numOfMovesPerGame[i] = Integer.parseInt(buf[i]);
            }
        } catch (Exception e) {
            throw e;
        }

        return inputData;
    }

    public static void main(String[] args) throws Exception {
        InputData inputData = processStdin();

        solution(inputData.numOfAllPlayers, inputData.numOfQuickPlayers, inputData.namesOfQuickPlayers, inputData.numOfGames, inputData.numOfMovesPerGame);
    }
}