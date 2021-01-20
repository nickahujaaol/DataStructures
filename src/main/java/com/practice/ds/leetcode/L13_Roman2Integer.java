package com.practice.ds.leetcode;

public class L13_Roman2Integer {
    static char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    static int[] values = {1, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) {
        String romanNum = "MMMCMXCIV"; // 3994
        int num = getNum(romanNum);
        System.out.println(num);
    }

    private static int getNum(String romanNum) {
        int num = 0;
        return num;
    }
}
