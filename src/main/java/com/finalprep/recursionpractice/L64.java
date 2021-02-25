package com.finalprep.recursionpractice;

public class L64 {
    private static int minSum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};

        findMin(matrix, 0, 0, 0);
        System.out.println(minSum);
    }

    private static void findMin(int[][] matrix, int row, int col, int sumSoFar) {
        sumSoFar += matrix[row][col];
        if(row == matrix.length - 1 && col == matrix[0].length - 1) {
            minSum = Math.min(minSum, sumSoFar);
            return;
        }

        if(isValid(matrix, row + 1, col))
            findMin(matrix, row + 1, col, sumSoFar);
        if(isValid(matrix, row, col + 1))
            findMin(matrix, row, col + 1, sumSoFar);
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
