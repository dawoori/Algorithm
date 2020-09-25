package com.dawool.leetcode;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double answer;
        int m = nums1.length;
        int n = nums2.length;
        int[] newNums = new int[m + n];

        System.arraycopy(nums1, 0, newNums, 0, m);
        System.arraycopy(nums2, 0, newNums, 0 + m, n);

        Arrays.sort(newNums);

        if ((m + n) % 2 == 0) {
            answer = (double) (newNums[(m + n) / 2] + newNums[(m + n) / 2 - 1]) / 2;
        } else {
            answer = newNums[(m + n) / 2];
        }

        System.out.println(Arrays.toString(newNums));

        return answer;
    }
}
