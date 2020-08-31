package com.learning.ds.geeksforgeeks.arrays.matrix;

import java.util.Arrays;

//https://www.geeksforgeeks.org/inplace-rotate-square-matrix-by-90-degrees/
//http://javabypatel.blogspot.com/2016/11/rotate-matrix-by-90-degrees-inplace.html

public class InPlaceRotateMatrixBy90Deg {
    public static void rotate(int data[][]) {

    }

    public static void main(String args[]) {
        int[][] data = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotate(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
