package com.learning.ds.techiedelight.dfs;

// https://www.techiedelight.com/find-length-longest-path-matrix-consecutive-characters/
public class LongestPathWithConsecutiveCharacters {
    static int rows[] = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int cols[] = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int maxLength = 0;

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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == startChar) {
                    boolean[][] visited = new boolean[5][5];
                    findMaxLength(matrix, startChar, i, j, 1, visited);
                }
            }
        }
        System.out.println("Max length is : " + maxLength);
    }

    private static void findMaxLength(char[][] matrix, int currChar, int row, int col, int length, boolean[][] visited) {
        visited[row][col] = true;
        maxLength = Math.max(maxLength, length);
        for(int i = 0; i < rows.length; i++) {
            if(isValid(matrix, row + rows[i], col + cols[i], currChar, visited)) {
                findMaxLength(matrix, currChar + 1, row + rows[i], col + cols[i], length + 1, visited);
            }
        }
    }


    private static boolean isValid(char[][] matrix, int row, int column, int currChar, boolean[][] visited) {
        if (row >= 0 && row < matrix.length &&
                column >= 0 && column < matrix[0].length &&
                matrix[row][column] == (currChar + 1) &&
                !visited[row][column]) {
            return true;
        } else {
            return false;
        }
    }
}
