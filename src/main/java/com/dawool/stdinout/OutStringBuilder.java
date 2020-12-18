package com.dawool.stdinout;

public class OutStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append(true);

        sb.append('\n');
        sb.append('a');

        char[] chars = new char[] {'b', 'c', 'd'};
        sb.append('\n');
        sb.append(chars);

        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
}
