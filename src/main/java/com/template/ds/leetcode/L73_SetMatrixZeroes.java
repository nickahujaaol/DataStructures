package com.template.ds.leetcode;

import java.util.Arrays;

public class L73_SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,2,3},
                {3,4,0,2},
                {1,3,1,5}};

        setZeroes(matrix);
        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    private static void setZeroes(int[][] matrix) {

    }
}
