package com.practice.ds.leetcode;

import java.util.ArrayList;

public class L6_ZigZagConversion {
    public static void main(String[] args) {
        String inString = "PAYPALISHIRING";
        int rows = 3;
        print(inString, rows);
    }

    private static void print(String inString, int rows) {
        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            list.add(new ArrayList<>());
        }

        boolean downFlag = true;
        int counter = 0;

        for(int i = 0; i < inString.length(); i++) {
            ArrayList<Character> tempList = list.get(counter);
            tempList.add(inString.charAt(i));

            if(counter == rows - 1)
                downFlag = !downFlag;

            if(downFlag)
                counter++;
            else
                counter--;

            if(counter == 0)
                downFlag = !downFlag;
        }

        System.out.println(list);
    }
}
