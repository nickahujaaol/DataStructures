package com.learning.ds.geeksforgeeks.arrays.matrix;

//https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
public class PrintSpiral {
    public static void printSpiral(int[][] data) {
        //Things to Remember: Whatever row you print, + or - that index.
        int startRowIndex = 0;
        int endRowIndex = data.length - 1;
        int startColumnIndex = 0;
        int endColumnIndex = data[0].length - 1;

        while (startRowIndex <= endRowIndex) {
            for (int i = startColumnIndex; i <= endColumnIndex; i++) {
                System.out.print(" " + data[startRowIndex][i]);
            }
            startRowIndex++;

            for (int i = startRowIndex; i <= endRowIndex; i++) {
                System.out.print(" " + data[i][endColumnIndex]);
            }
            endColumnIndex--;

            for (int i = endColumnIndex; i >= startColumnIndex; i--) {
                System.out.print(" " + data[endRowIndex][i]);
            }
            endRowIndex--;

            for (int i = endRowIndex; i >= startRowIndex; i--) {
                System.out.print(" " + data[i][startColumnIndex]);
            }
            startColumnIndex++;
        }

    }

    public static void main(String[] args) {
        int[][] data = { {1, 2,  3,  4,  5},
                         {6, 7,  8,  9,  10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}};

        printSpiral(data);
    }
}
