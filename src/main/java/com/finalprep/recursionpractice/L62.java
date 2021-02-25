package com.finalprep.recursionpractice;

public class L62 {
    private static int numOfJumps = 0;

    public static void main(String[] args) {
        int[][] grid = new int[3][7];
        findPaths(grid, 0, 0);
        System.out.println(numOfJumps);
    }

    private static void findPaths(int[][] grid, int rowIndex, int colIndex) {
        if(rowIndex == grid.length - 1 && colIndex == grid[0].length - 1) {
            numOfJumps++;
            return;
        }

        if(isValid(grid, rowIndex + 1, colIndex))
            findPaths(grid, rowIndex + 1, colIndex);
        if(isValid(grid, rowIndex, colIndex + 1))
            findPaths(grid, rowIndex, colIndex + 1);
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length) {
            return true;
        }
        return false;
    }
}
