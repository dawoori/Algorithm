package com.dawool.topcoder;

import java.util.ArrayList;

public class NumberMagicEasy {
    public int theNumber(String answer) {
//        int[] card1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        int[] card2 = {1, 2, 3, 4, 9, 10, 11, 12};
//        int[] card3 = {1, 2, 5, 6, 9, 10, 13, 14};
//        int[] card4 = {1, 3, 5, 7, 9, 11, 13, 15};
//
//        ArrayList<Integer> num = new ArrayList<>();
        int[] nums = new int[4];
        for (int i = 0; i < 4; i++) {
            if (answer.charAt(i) == 'Y') nums[i] = 1;
            else nums[i] = 0;
        }
        int number = 16 - nums[0] * 8 - nums[1] * 4 - nums[2] * 2 - nums[3];
        return number;
    }
}
