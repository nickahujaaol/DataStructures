package com.learning.ds.techiedelight.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
        int x = 3, y = 9;	// target color = "X"
        // replacement color
        char replacement = 'C';
        // replace target color with replacement color
        floodFill(matrix, x, y, replacement);

        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void floodFill(char[][] matrix, int targetRow, int targetCol, char replacementColor) {
        char targetColor = matrix[targetRow][targetCol];
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(targetRow, targetCol));

        while (!queue.isEmpty()) {
            Pair tempPair = queue.remove();
            int row = tempPair.x;
            int col = tempPair.y;
            matrix[tempPair.x][tempPair.y] = replacementColor;

            if(isValid(matrix, row - 1, col - 1, targetColor))
                queue.add(new Pair(row - 1, col - 1));
            if(isValid(matrix, row - 1, col, targetColor))
                queue.add(new Pair(row - 1, col));
            if(isValid(matrix, row - 1, col + 1, targetColor))
                queue.add(new Pair(row - 1, col + 1));
            if(isValid(matrix, row, col - 1, targetColor))
                queue.add(new Pair(row, col - 1));
            if(isValid(matrix, row, col + 1, targetColor))
                queue.add(new Pair(row, col + 1));
            if(isValid(matrix, row + 1, col - 1, targetColor))
                queue.add(new Pair(row + 1, col - 1));
            if(isValid(matrix, row - 1, col - 1, targetColor))
                queue.add(new Pair(row - 1, col - 1));
            if(isValid(matrix, row + 1, col + 1, targetColor))
                queue.add(new Pair(row + 1, col + 1));
        }

    }

    private static boolean isValid(char[][] matrix, int targetRow, int targetCol, char targetColor) {
        if(targetRow >= 0 && targetRow < matrix.length &&
        targetCol >= 0 && targetCol < matrix[0].length &&
                matrix[targetRow][targetCol] == targetColor) {
            return true;
        } else {
            return false;
        }
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
