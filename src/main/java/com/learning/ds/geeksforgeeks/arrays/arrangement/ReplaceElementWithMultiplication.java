package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
public class ReplaceElementWithMultiplication {
    public static void arrange(int[] data) {
        int prevNum = data[0];
        data[0] = data[0] * data[1];

        for(int i = 1; i < data.length - 1; i++) {
            int currNum = data[i];
            data[i] = prevNum * data[i + 1];
            prevNum = currNum;
        }

        data[data.length - 1] = data[data.length - 1] * prevNum;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
        // Answer - 6, 8, 15, 24, 30
    }
}
