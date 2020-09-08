package com.learning.ds.techiedelight.arrays;

import java.util.Arrays;

// https://www.techiedelight.com/inplace-merge-two-sorted-arrays/
public class Merge2SortedArrays_10 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 4, 7, 8, 10 };
        int[] arr2 = { 2, 3, 9 };
        merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    private static void merge(int[] arr1, int[] arr2) {
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] > arr2[0]) {
                int temp = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = temp;
                Arrays.sort(arr2);
            }
        }
    }
}
