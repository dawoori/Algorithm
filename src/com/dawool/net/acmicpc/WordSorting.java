package com.dawool.net.acmicpc;
//https://www.acmicpc.net/problem/1181

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class WordSorting {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numN = Integer.parseInt(br.readLine());
        ArrayList<String>[] words = new ArrayList[50];
        for (int i = 0; i < 50; i++) {
            words[i] = new ArrayList<String>();
        }

        for (int i = 0; i < numN; i++) {
            String word = br.readLine();
            if(!words[word.length() - 1].contains(word)) words[word.length() - 1].add(word);
        }

        for (int i = 0; i < 50; i++) {
            Collections.sort(words[i]);
            for (int j = 0; j < words[i].size(); j++) {
                System.out.println(words[i].get(j));
            }
        }
    }
}

