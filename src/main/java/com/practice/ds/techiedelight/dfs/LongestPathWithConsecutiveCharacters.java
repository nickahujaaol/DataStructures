package com.practice.ds.techiedelight.dfs;

// https://www.techiedelight.com/find-length-longest-path-matrix-consecutive-characters/
public class LongestPathWithConsecutiveCharacters {
    static int xCoord[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int yCoord[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        char[][] matrix =
                {
                        {'D', 'E', 'H', 'X', 'B'},
                        {'A', 'O', 'G', 'P', 'E'},
                        {'D', 'D', 'C', 'F', 'D'},
                        {'E', 'B', 'E', 'A', 'S'},
                        {'C', 'D', 'Y', 'E', 'N'}
                };
        findMaxLength(matrix, 'C');
    }

    private static void findMaxLength(char[][] matrix, char startChar) {
        int maxLength = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == startChar) {
                    boolean[][] visited = new boolean[matrix.length][matrix.length];
                    int maxSoFar = findMaxLength(matrix, startChar, i, j, 0, visited);
                    maxLength = Math.max(maxLength, maxSoFar);
                }
            }
        }
        System.out.println("Max length is: " + maxLength);
    }

    private static int findMaxLength(char[][] matrix, int currChar, int row, int col, int length, boolean[][] visited) {
        visited[row][col] = true;

        for (int i = 0; i < xCoord.length; i++) {
            if (isValid(matrix, row + xCoord[i], col + yCoord[i], currChar, visited)) {
                length = findMaxLength(matrix, currChar + 1,
                        row + xCoord[i], col + yCoord[i], length + 1, visited);
            }
        }
        return length;
    }

    private static boolean isValid(char[][] matrix, int row, int column, int currChar, boolean[][] visited) {

        if (row >= 0 && row < matrix.length &&
                column >= 0 && column < matrix.length &&
                matrix[row][column] == (currChar + 1) &&
                !visited[row][column]
        ) {
            return true;
        } else {
            return false;
        }
    }
}
