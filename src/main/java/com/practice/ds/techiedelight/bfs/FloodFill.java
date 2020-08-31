package com.practice.ds.techiedelight.bfs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// https://www.techiedelight.com/flood-fill-algorithm/
public class FloodFill {
    private static final int[] row = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] col = {-1, 0, 1, -1, 1, -1, 0, 1};

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
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(targetRow, targetCol));
        boolean[][] visited = new boolean[matrix.length][matrix.length];
        char targetColor = matrix[targetRow][targetCol];

        while (!queue.isEmpty()) {
            Pair removedPair = queue.poll();
            visited[removedPair.x][removedPair.y] = true;
            matrix[removedPair.x][removedPair.y] = replacementColor;
            for (int i = 0; i < row.length; i++) {
                if (isValid(matrix, removedPair.x + row[i], removedPair.y + col[i], targetColor, visited)) {
                    queue.add(new Pair(removedPair.x + row[i], removedPair.y + col[i]));
                }
            }
        }
    }

    private static boolean isValid(char[][] matrix, int targetRow, int targetCol, char targetColor, boolean[][] visited) {
        if (targetRow >= 0 && targetRow < matrix.length &&
                targetCol >= 0 && targetCol < matrix.length &&
                matrix[targetRow][targetCol] == targetColor &&
                !visited[targetRow][targetCol]) {
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
