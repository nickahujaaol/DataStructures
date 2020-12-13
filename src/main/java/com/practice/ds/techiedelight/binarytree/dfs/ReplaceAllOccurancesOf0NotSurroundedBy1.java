package com.practice.ds.techiedelight.binarytree.dfs;

import java.util.Arrays;

// https://www.techiedelight.com/replace-occurrences-0-not-surrounded-1-binary-matrix/
public class ReplaceAllOccurancesOf0NotSurroundedBy1 {
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

    private static void dfs(int[][] matrix, int row, int col) {

    }

    private static boolean isValid(int[][] matrix, int row, int col) {
        return false;
    }
}
