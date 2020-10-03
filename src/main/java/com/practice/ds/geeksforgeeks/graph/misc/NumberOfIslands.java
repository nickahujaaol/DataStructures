package com.practice.ds.geeksforgeeks.graph.misc;

// https://www.geeksforgeeks.org/find-number-of-islands/
// https://www.techiedelight.com/count-the-number-of-islands/
public class NumberOfIslands {
    private static final int[] rows = {-1, -1, -1, 0, 0, 1, 1, 1};
    private static final int[] cols = {-1, 0, 1, -1, 1, -1, 0, 1};

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 0, 1, 0, 0, 0, 1, 1, 1, 1},
                        {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 1, 0, 0, 0},
                        {1, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
                        {0, 1, 0, 1, 0, 0, 1, 1, 1, 1},
                        {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
                        {1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                        {1, 1, 1, 1, 0, 0, 0, 1, 1, 1}
                };

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int numOfIslands = 0;
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(!visited[i][j] && matrix[i][j] != 0) {
                    dfs(matrix, i, j, visited);
                    numOfIslands++;
                }
            }
        }
        System.out.println("Number rof Islands: " + numOfIslands);
    }

    private static void dfs(int[][] matrix, int row, int col, boolean[][] visited) {
        visited[row][col] = true;
        for(int i = 0; i < rows.length; i++) {
            for(int j = 0; j < cols.length; j++) {
                if(isSafe(matrix, row + rows[i], col + cols[j], visited))
                    dfs(matrix, row + rows[i], col + cols[j], visited);
            }
        }
    }

    private static boolean isSafe(int[][] matrix, int row, int column, boolean[][] visited) {
        if(row >= 0 && column >= 0 && row < matrix.length && column < matrix.length
                && matrix[row][column] != 0
                && !visited[row][column])
            return true;
        return false;
    }


}
