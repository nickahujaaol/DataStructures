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
        int num = 0;
        HashMap<Character, Integer> romanToValueMap = new HashMap<>();
        for(int i = 0; i < values.length; i++) {
            romanToValueMap.put(roman[i], values[i]);
        }

        for(int i = 0; i < romanNum.length(); i++) {
            int finalVal = 0;
            int valueAtIndex = romanToValueMap.get(romanNum.charAt(i));
            if((i + 1) < romanNum.length()) {
                int valueAtNextIndex = romanToValueMap.get(romanNum.charAt(i + 1));
                if(valueAtNextIndex > valueAtIndex) {
                    finalVal = valueAtNextIndex - valueAtIndex;
                    i++;
                } else {
                    finalVal = valueAtIndex;
                }
            } else {
                finalVal = valueAtIndex;
            }

            num = num + finalVal;
        }
        return num;
    }
}
