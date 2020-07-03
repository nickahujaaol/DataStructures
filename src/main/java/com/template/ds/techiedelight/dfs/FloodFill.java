package com.template.ds.techiedelight.dfs;

import java.util.Arrays;

// https://www.techiedelight.com/flood-fill-algorithm/
public class FloodFill {
    public static void main(String[] args) {
        // matrix showing portion of the screen having different colors
        char[][] matrix = {
                "YYYGGGGGGG".toCharArray(),
                "YYYYYYGXXX".toCharArray(),
                "GGGGGGGXXX".toCharArray(),
                "WWWWWGGGGX".toCharArray(),
                "WRRRRRGXXX".toCharArray(),
                "WWWRRGGXXX".toCharArray(),
                "WBWRRRRRRX".toCharArray(),
                "WBBBBRRXXX".toCharArray(),
                "WBBXBBBBXX".toCharArray(),
                "WBBXXXXXXX".toCharArray()
        };


        floodFill(matrix, 3, 9, 'X', 'C');

        // print the colors after replacement
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void floodFill(char[][] matrix, int row, int col, char targetChar, char replacementChar) {

    }

    private static boolean isValid(char[][] matrix, int row, int col, char targetChar) {
        return false;
    }
}
