package com.dawool;

import java.util.LinkedList;

public class TestT {
    public static void main(String[] args){
        boolean[] visit = new boolean[3];
        System.out.println(visit[1]);
        visit[1] = true;
        System.out.println(visit[1]);
        visit = new boolean[3];
        System.out.println(visit[1]);

        LinkedList<Integer> que = new LinkedList<>();
        que.add(2);
        que.add(4);
        System.out.println(que);
        System.out.println(que.pop());
        System.out.println(que);
        System.out.println(que.peek());
        System.out.println(que);
    }

}
