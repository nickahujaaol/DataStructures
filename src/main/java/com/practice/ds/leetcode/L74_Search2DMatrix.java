package com.practice.ds.leetcode;

public class L74_Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}};
        boolean present = search(matrix, 0, matrix.length * matrix[0].length - 1, 10);
        System.out.println(present);

    }

    private static boolean search(int[][] matrix, int low, int high, int target) {
        return false;
    }
}
