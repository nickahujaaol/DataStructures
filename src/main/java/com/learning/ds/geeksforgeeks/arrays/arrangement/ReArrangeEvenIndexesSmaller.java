package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-even-index-elements-smaller-odd-index-elements-greater/
public class ReArrangeEvenIndexesSmaller {
    public static void arrange(int[] data) {
        for(int i = 0; i < data.length - 1; i++) {
            if(i % 2 == 0 && data[i] > data[i+1]){
                swap(data, i, i+1);
            } else if(i % 2 == 1 && data[i] < data[i+1]) {
                swap(data, i, i+1);
            }
        }
    }

    private static void swap(int[] data, int index1, int index2) {
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {6, 4, 2, 1, 8, 3};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
        // ANSWER should be 4, 6, 1, 8, 2, 3
    }
}
