package com.template.ds.techiedelight.bfs;

import java.util.Arrays;

// https://www.techiedelight.com/flood-fill-algorithm/
public class FloodFill {
    public static void main(String[] args) {
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

        // start node
        int x = 3, y = 9;    // target color = "X"
        // replacement color
        char replacement = 'C';
        // replace target color with replacement color
        floodFill(matrix, x, y, replacement);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void floodFill(char[][] matrix, int targetRow, int targetCol, char replacementColor) {

    }

    private static boolean isValid(char[][] matrix, int targetRow, int targetCol, char targetColor) {
        return false;
    }

    public static class Pair {
        private int x;
        private int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
