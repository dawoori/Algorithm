package com.dawool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        int[] a = new int[]{3, 5, 7};
        int[] b = new int[]{4, 10, 12};

        int good = solution.solution(a, b);
        System.out.println(good);


    }
}