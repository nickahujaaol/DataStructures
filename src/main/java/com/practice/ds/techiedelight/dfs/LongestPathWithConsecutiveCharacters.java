package com.practice.ds.techiedelight.dfs;

// https://www.techiedelight.com/find-length-longest-path-matrix-consecutive-characters/
public class LongestPathWithConsecutiveCharacters {
    static int xCoord[] = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int yCoord[] = { -1, 0, 1, -1, 1, -1, 0, 1 };

    public static void main(String[] args) {
        char[][] matrix =
                {
                        { 'D', 'E', 'H', 'X', 'B' },
                        { 'A', 'O', 'G', 'P', 'E' },
                        { 'D', 'D', 'C', 'F', 'D' },
                        { 'E', 'B', 'E', 'A', 'S' },
                        { 'C', 'D', 'Y', 'E', 'N' }
                };
        findMaxLength(matrix, 'C');
    }

    private static void findMaxLength(char[][] matrix, char startChar) {

    }

    private static int findMaxLength(char[][] matrix, int currChar, int row, int col, int length, boolean[][] visited) {
        return 0;
    }

    private static boolean isValid(char[][] matrix, int row, int column, int currChar, boolean[][] visited) {
        return false;
    }
}
