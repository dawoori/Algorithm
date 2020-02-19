//https://www.acmicpc.net/problem/15649
package com.dawool.net.acmicpc;

import java.io.*;
import java.util.*;

class NAndM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numberN = Integer.parseInt(st.nextToken());
        int numberM = Integer.parseInt(st.nextToken());

        int lengthOfSequence = 1;
        for (int i = numberN; i > numberN - numberM; i--) {
            lengthOfSequence *= i;
        }

        int[][] sequences = new int[lengthOfSequence][numberM];

        for (int i = 0; i < numberM; i++) {
            int howMany = lengthOfSequence;
            for (int k = 0; k < i + 1; k++) {
                howMany /= numberN - k;
            }
            for (int j = 0; j < lengthOfSequence / howMany; j++) {
                List<Integer> numbers = new ArrayList<>();
                for (int k = 1; k < numberN + 1; k++) {
                    numbers.add(k);
                }
                for (int k = 0; k < i + 1; k++) {
                    numbers.remove((Integer) sequences[j * howMany][k]);
                }

                for (int k = 0; k < howMany; k++) {
                    sequences[j * howMany + k][i] = numbers.get(j % (numberN - i));
                }
            }

        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < sequences.length; i++) {
            String str = "";
            for (int j = 0; j < sequences[i].length; j++) {
                str += sequences[i][j];
                str += " ";
            }
            bw.write(str+"\n");
        }
        bw.flush();
        bw.close();
    }
}