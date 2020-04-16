package com.dawool.net.acmicpc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ACMHotel {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numT = Integer.parseInt(br.readLine());

        for (int i = 0; i < numT; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int numH = Integer.parseInt(st.nextToken());
            int numW = Integer.parseInt(st.nextToken());
            int numN = Integer.parseInt(st.nextToken());

            int floor;
            int roomNumber;
            if (numN % numH == 0) {
                floor = numH;
                roomNumber = numN / numH;
            }
            else {
                floor = numN % numH;
                roomNumber = numN / numH + 1;
            }

            System.out.println(floor*100 + roomNumber);
        }
    }
}
