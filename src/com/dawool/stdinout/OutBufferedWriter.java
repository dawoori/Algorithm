package com.dawool.stdinout;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutBufferedWriter {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = "abcdefg";
        bw.write(s);
        bw.newLine();
        bw.write("newline hi");
        bw.write('\n');
        bw.write("newline hi");
        bw.flush();
        bw.close();

    }
}
