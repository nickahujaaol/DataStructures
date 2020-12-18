package com.practice.ds.leetcode;

public class L8_String2Int {
    public static void main(String[] args) {
        String stringNum = "42";
        int num = convert(stringNum);
        System.out.println(num);
    }

    private static int convert(String stringNum) {
        int num = 0;
        char[] inChars = stringNum.toCharArray();

        for(int i = 0; i < inChars.length; i++) {
            int tempNum = inChars[i] - '0';
            num = num * 10 + tempNum;
        }
        return num;
    }
}
