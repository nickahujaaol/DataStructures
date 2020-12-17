package com.template.ds.leetcode;

public class L62_UniquePaths {
    public static void main(String[] args) {
        int[][] matrix = new int[3][7];
        matrix[0][0] = 1;
        matrix[2][6] = 2;
        int paths = uniquePaths(matrix, 0, 0, 0);
        System.out.println(paths);
    }

    private static int uniquePaths(int[][] matrix, int row, int col, int numOfPaths) {

        return numOfPaths;
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
        col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
