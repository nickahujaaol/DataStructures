package com.practice.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L6_ZigZagConversion {
    public static void main(String[] args) {
        String inString = "PAYPALISHIRING";
        int rows = 3;
        print(inString, rows);
    }

    private static void print(String inString, int rows) {
        List<List<Character>> rowsList = new ArrayList<>();
        for(int i = 0; i < rows; i++) {
            rowsList.add(new ArrayList<Character>());
        }
        boolean downFlag = true;
        int index = 0;

        for(int i = 0; i < inString.length(); i++) {
            rowsList.get(index).add(inString.charAt(i));

            if(downFlag) {
                index++;
            } else {
                index--;
            }

            if(index == rows - 1 || index == 0) {
                downFlag = !downFlag;
            }
        }


        System.out.println(rowsList);
    }
}
