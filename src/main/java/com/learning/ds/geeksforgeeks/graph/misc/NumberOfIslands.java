package com.learning.ds.geeksforgeeks.graph.misc;

// https://www.geeksforgeeks.org/find-number-of-islands/
// https://www.techiedelight.com/count-the-number-of-islands/
public class NumberOfIslands {
    public static void main(String[] args) {
        int[][] matrix=
                {
                        { 1, 0, 1, 0, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 1, 0, 1, 0, 1, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 1, 0, 0, 0 },
                        { 1, 0, 0, 1, 0, 1, 0, 0, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 },
                        { 0, 1, 0, 1, 0, 0, 1, 1, 1, 1 },
                        { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 },
                        { 0, 0, 0, 1, 0, 0, 1, 1, 1, 0 },
                        { 1, 0, 1, 0, 1, 0, 0, 1, 0, 0 },
                        { 1, 1, 1, 1, 0, 0, 0, 1, 1, 1 }
                };

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int numOfIslands = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1 && !visited[i][j]) {
                    dfs(matrix, i, j, visited);
                    numOfIslands++;
                }
            }
        }

        System.out.println("Number rof Islands: " + numOfIslands);
    }

    private static boolean isSafe(int[][] matrix, int row, int column, boolean[][] visited) {
        if(row >= 0 && row < matrix.length &&
            column >=0 && column < matrix[0].length &&
                matrix[row][column] == 1 &&
                !visited[row][column]) {
            return true;
        } else {
            return false;
        }
    }

    private static void dfs(int[][] matrix, int row, int col, boolean[][] visited) {
        visited[row][col] = true;

        if(isSafe(matrix, row - 1, col - 1, visited))
            dfs(matrix, row - 1, col - 1, visited);
        if(isSafe(matrix, row - 1, col, visited))
            dfs(matrix, row - 1, col, visited);
        if(isSafe(matrix, row - 1, col + 1, visited))
            dfs(matrix, row - 1, col + 1, visited);
        if(isSafe(matrix, row, col - 1, visited))
            dfs(matrix, row, col - 1, visited);
        if(isSafe(matrix, row, col + 1, visited))
            dfs(matrix, row, col + 1, visited);
        if(isSafe(matrix, row + 1, col - 1, visited))
            dfs(matrix, row + 1, col - 1, visited);
        if(isSafe(matrix, row + 1, col, visited))
            dfs(matrix, row + 1, col, visited);
        if(isSafe(matrix, row + 1, col + 1, visited))
            dfs(matrix, row + 1, col + 1, visited);
    }
}
