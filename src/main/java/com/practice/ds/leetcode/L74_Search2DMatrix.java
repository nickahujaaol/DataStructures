package com.practice.ds.leetcode;

public class L74_Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,50}};
        boolean present = search(matrix, 0, matrix.length * matrix[0].length - 1, 16);
        System.out.println(present);

    }

    private static boolean search(int[][] matrix, int low, int high, int target) {
        if(low > high)
            return false;

        int midRow = ((low + high) / 2) / matrix[0].length;
        int midCol = ((low + high) / 2) % matrix[0].length;

        if(matrix[midRow][midCol] == target)
            return true;

        if(matrix[midRow][midCol] > target)
            return search(matrix, low , ((low + high) / 2) - 1, target);
        else
            return search(matrix, ((low + high) / 2) + 1 , high, target);
    }
}
