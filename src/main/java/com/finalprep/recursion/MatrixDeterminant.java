package com.finalprep.recursion;

import java.util.Arrays;

// https://sdjee2015.wixsite.com/whyandhow/single-post/2017/01/22/determinant-of-a-matrix-using-recursion
// http://codinlab.blogspot.com/2013/08/java-recursive-program-to-compute_1.html
public class MatrixDeterminant {
    public static void main(String[] args) {
        int mat[][] = { { 1, 0, 2, -1 },
                        { 3, 0, 0,  5 },
                        { 2, 1, 4, -3 },
                        { 1, 0, 5,  0 } };
        int determinant = findDeterminant(mat);
        System.out.println(determinant);
    }

    private static int findDeterminant(int[][] matrix) {
        if(matrix.length == 1) {
            return matrix[0][0];
        }

        if(matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int determinant = 0;
        int sign = 1;
        for(int i = 0; i < matrix.length; i++) {
            int[][] subMatrix = getSubMatrix(matrix, i);
            determinant = determinant + sign * matrix[0][i] * findDeterminant(subMatrix);
            sign = sign * -1;
        }

        return determinant;
    }

    private static int[][] getSubMatrix(int[][] matrix, int col) {
        int[][] subMatrix = new int[matrix.length - 1][matrix.length - 1];
        for(int i = 1; i < matrix.length; i++) {
            int colCounter = 0;
            for(int j = 0; j < matrix.length; j++) {
                if(j != col) {
                    subMatrix[i - 1][colCounter++] = matrix[i][j];
                }
            }
        }

        return subMatrix;
    }
}
