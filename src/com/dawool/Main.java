package com.dawool;

import com.dawool.topcoder.ChessMetric;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ChessMetric chessMetric = new ChessMetric();
        long a = chessMetric.howMany(3, new int[]{0, 0}, new int[]{1, 0}, 1);
        System.out.println(a);
    }
}