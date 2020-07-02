package com.learning.ds.techiedelight.dfs;

import java.util.Arrays;

// https://www.techiedelight.com/replace-occurrences-of-0-surrounded-by-1-matrix/
// read the solution
public class ReplaceAllOccurrencesOf0SurroundedBy1 {

    public static void main(String[] args) {
        int[][] matrix =
                {
                        { 1, 1, 1, 1, 0, 0, 1, 1, 0, 1 },
                        { 1, 0, 0, 1, 1, 0, 1, 1, 1, 1 },
                        { 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 1, 1, 0, 0, 1, 1, 0, 1 },
                        { 0, 0, 1, 1, 0, 0, 0, 1, 0, 1 },
                        { 1, 0, 0, 1, 1, 0, 1, 1, 0, 0 },
                        { 1, 1, 0, 1, 1, 1, 1, 1, 1, 1 },
                        { 1, 1, 0, 1, 1, 0, 0, 1, 0, 1 },
                        { 1, 1, 1, 0, 1, 0, 1, 0, 0, 1 },
                        { 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }
                };


        replaceZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void replaceZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            if(matrix[0][i] == 0) {
                dfs(matrix, 0, i, -1);
            }
            if(matrix[matrix.length - 1][i] == 0) {
                dfs(matrix, matrix.length - 1, i, -1);
            }
            if(matrix[i][0] == 0) {
                dfs(matrix, i, 0, -1);
            }
            if(matrix[i][matrix.length - 1] == 0) {
                dfs(matrix, i, matrix.length - 1, -1);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    dfs(matrix, i, j, 1);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == -1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void dfs(int[][] matrix, int row, int col, int replacement) {
        matrix[row][col] = replacement;

        if(isValid(matrix, row - 1, col - 1))
            dfs(matrix, row - 1, col - 1, replacement);
        if(isValid(matrix, row - 1, col))
            dfs(matrix, row - 1, col, replacement);
        if(isValid(matrix, row - 1, col + 1))
            dfs(matrix, row - 1, col + 1, replacement);
        if(isValid(matrix, row, col - 1))
            dfs(matrix, row, col - 1, replacement);
        if(isValid(matrix, row, col + 1))
            dfs(matrix, row, col + 1, replacement);
        if(isValid(matrix, row + 1, col - 1))
            dfs(matrix, row + 1, col - 1, replacement);
        if(isValid(matrix, row - 1, col - 1))
            dfs(matrix, row - 1, col - 1, replacement);
        if(isValid(matrix, row + 1, col + 1))
            dfs(matrix, row + 1, col + 1, replacement);
    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        if(row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length &&
                matrix[row][col] == 0) {
            return true;
        } else {
            return false;
        }
    }
}
