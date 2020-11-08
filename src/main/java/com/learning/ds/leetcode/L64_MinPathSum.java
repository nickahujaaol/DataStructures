package com.learning.ds.leetcode;

public class L64_MinPathSum {
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}};

        int pathSum = minPathSum(matrix, 0, 0, 0, Integer.MAX_VALUE);
        System.out.println(pathSum);
    }

    private static int minPathSum(int[][] matrix, int row, int col, int sumSoFar, int minSum) {
        if(row == matrix.length - 1 && col == matrix.length - 1)
            return Math.min(minSum, sumSoFar + matrix[matrix.length - 1][matrix.length - 1]);

        if(isValid(matrix, row + 1, col)) {
            minSum = minPathSum(matrix, row + 1, col, sumSoFar + matrix[row][col], minSum);
        }

        if(isValid(matrix, row, col + 1)) {
            minSum = minPathSum(matrix, row, col + 1, sumSoFar + matrix[row][col], minSum);
        }

        return minSum;
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
