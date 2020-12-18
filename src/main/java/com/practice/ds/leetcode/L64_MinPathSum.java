package com.practice.ds.leetcode;

import java.util.Arrays;

public class L64_MinPathSum {
    static int minSum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}};

        minPathSum(matrix, 0, 0, 0);
        System.out.println(minSum);
    }

    private static void minPathSum(int[][] matrix, int row, int col, int sumSoFar) {
        if(row == matrix.length - 1 && col == matrix.length - 1)
            minSum = Math.min(minSum, matrix[row][col] + sumSoFar);

        if(!isValid(matrix, row, col))
            return;

        minPathSum(matrix, row, col + 1, matrix[row][col] + sumSoFar);
        minPathSum(matrix, row + 1, col, matrix[row][col] + sumSoFar);
    }


    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
