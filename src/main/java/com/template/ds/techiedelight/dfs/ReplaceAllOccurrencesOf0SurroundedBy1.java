package com.template.ds.techiedelight.dfs;

import java.util.Arrays;

// https://www.techiedelight.com/replace-occurrences-of-0-surrounded-by-1-matrix/
// read the solution
public class ReplaceAllOccurrencesOf0SurroundedBy1 {

    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1, 1, 1, 1, 0, 0, 1, 1, 0, 1},
                        {1, 0, 0, 1, 1, 0, 1, 1, 1, 1},
                        {1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 1, 0, 0, 1, 1, 0, 1},
                        {0, 0, 1, 1, 0, 0, 0, 1, 0, 1},
                        {1, 0, 0, 1, 1, 0, 1, 1, 0, 0},
                        {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 0, 1, 1, 0, 0, 1, 0, 1},
                        {1, 1, 1, 0, 1, 0, 1, 0, 0, 1},
                        {1, 1, 1, 0, 1, 1, 1, 1, 1, 1}
                };


        replaceZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void replaceZeroes(int[][] matrix) {

    }

    private static void dfs(int[][] matrix, int row, int col, int replacement) {

    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        return false;
    }
}
