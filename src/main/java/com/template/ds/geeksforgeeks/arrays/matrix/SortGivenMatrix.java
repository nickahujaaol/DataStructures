package com.template.ds.geeksforgeeks.arrays.matrix;

import java.util.Arrays;

//https://www.geeksforgeeks.org/sort-given-matrix/
public class SortGivenMatrix {
    public static void sort(int[][] data) {

    }

    public static void main(String args[]) {
        int[][] data = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
