package com.dawool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Main {
    public static void main(String[] args) throws ParseException {
        Solution solution = new Solution();

        Set<Integer> lamp = new HashSet<>();
        lamp.add(1);
        lamp.add(2);
        lamp.add(3);
        lamp.add(4);

        System.out.println(lamp);
        System.out.println(lamp.contains(1));

        lamp.remove(1);
        System.out.println(lamp);
        System.out.println(lamp.contains(1));
    }
}