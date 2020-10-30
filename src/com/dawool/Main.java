package com.dawool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();
        String good = solution.solution("4177252841", 8);
        System.out.println(good);

        int k = 5;
        System.out.println(k);
        System.out.println(k--);
        System.out.println(k);
        System.out.println(--k);
        System.out.println(k);

    }
}