package com.practice.ds.leetcode;

import java.util.HashMap;

public class L13_Roman2Integer {
    static char[] roman = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    static int[] values = {1, 5, 10, 50, 100, 500, 1000};

    public static void main(String[] args) {
        String romanNum = "MMMCMXCIV"; // 3994
        int num = getNum(romanNum);
        System.out.println(num);
    }

    private static int getNum(String romanNum) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < roman.length; i++) {
            map.put(roman[i], values[i]);
        }
        int num = 0;

        for(int i = 0; i < romanNum.length(); i++) {
            int currValue = map.get(romanNum.charAt(i));
            if(i < romanNum.length() - 1) {
                int nxtValue = map.get(romanNum.charAt(i + 1));
                if(currValue < nxtValue) {
                    currValue = nxtValue - currValue;
                    i++;
                }
            }
            num = num + currValue;
        }


        return num;
    }
}
