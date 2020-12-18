package com.finalprep.recursion;

public class L79_WordSearch {
    private static final int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] cols = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        char[][] matrix = {
                            {'A', 'B', 'C', 'E'},
                            {'S', 'F', 'C', 'S'},
                            {'A', 'D', 'E', 'E'}};
        boolean found = search(matrix, 0, 0, "", 0, "ABCCED");
        System.out.println(found);
    }

    private static boolean search(char[][] matrix, int row, int col, String workingString, int workingCounter, String target) {

        return false;
    }

    private static boolean isValid(char[][] matrix, int row, int col, char targetChar) {
        if (row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix.length &&
                matrix[row][col] == targetChar) {
            return true;
        } else {
            return false;
        }
    }
}
