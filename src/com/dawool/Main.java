package com.dawool;

import java.util.*;

class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> pipes = new ArrayList<>();

        pipes.add(1);
        pipes.add(2);
        pipes.add(3);

        for (int i = 0; i < pipes.size(); i++) {
            pipes.set(i, pipes.get(i) + 1);
        }
        System.out.println(pipes);

        System.out.println(pipes.get(pipes.size() - 1));
        pipes.remove(pipes.size() - 1);
        System.out.println(pipes);
    }
}