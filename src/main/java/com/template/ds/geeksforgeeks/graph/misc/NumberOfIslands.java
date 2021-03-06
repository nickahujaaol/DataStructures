package com.template.ds.geeksforgeeks.graph.misc;

// https://www.geeksforgeeks.org/find-number-of-islands/
// https://www.techiedelight.com/count-the-number-of-islands/
public class NumberOfIslands {
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
        System.out.println("Number rof Islands: " + numOfIslands);
    }

    private static boolean isSafe(int[][] matrix, int row, int column, boolean[][] visited) {
        return false;
    }

    private static void dfs(int[][] matrix, int row, int col, boolean[][] visited) {

    }
}
