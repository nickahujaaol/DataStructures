package com.practice.ds.techiedelight.dfs;

import java.util.Arrays;

// https://www.techiedelight.com/flood-fill-algorithm/
public class FloodFill {
    private static final int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] cols = {-1, 0, 1, -1, 1, -1, 0, 1};

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

        matrix[row][col] = replacementChar;
        for(int i = 0; i < rows.length; i++) {
            if(isValid(matrix, row + rows[i], col + cols[i], targetChar)) {
                floodFill(matrix, row + rows[i], col + cols[i], targetChar, replacementChar);
            }
        }
    }

    private static boolean isValid(char[][] matrix, int row, int col, char targetChar) {
        if(row >= 0 && row < matrix.length && col >= 0 && col < matrix.length && matrix[row][col] == targetChar)
            return true;
        return false;
    }
}
