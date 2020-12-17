package com.template.ds.leetcode;

import java.util.Arrays;

public class L64_MinPathSum {
    static int minSum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] matrix = {
                        {1,3,1},
                        {1,5,1},
                        {4,2,1}};

        int pathSum = minPathSumTreeWay(matrix, 0, 0);
        System.out.println(pathSum);

        minPathSum(matrix, 0, 0, 0);
        System.out.println(minSum);

        int[][] dp = new int[matrix.length][matrix.length];
        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        minPathSum(matrix, 0, 0, 0, dp);
        for(int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        System.out.println(dp[2][2]);
    }

    private static void minPathSum(int[][] matrix, int row, int col, int sumSoFar, int[][] dp) {

    }

    private static void minPathSum(int[][] matrix, int row, int col, int sumSoFar) {

    }

    /*
    Create a Tree then you can visualize
     */
    private static int minPathSumTreeWay(int[][] matrix, int row, int col) {
        return 0;
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
