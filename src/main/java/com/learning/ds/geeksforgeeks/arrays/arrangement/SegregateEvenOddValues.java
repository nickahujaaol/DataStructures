package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/segregate-even-odd-numbers-set-3/
public class SegregateEvenOddValues {
    static void arrayEvenAndOdd(int arr[], int n) {
        int evenCounter = 0; // Variable that defines that at this index there ideally should be an even number

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                int temp = arr[evenCounter];
                arr[evenCounter] = arr[i];
                arr[i] = temp;
                evenCounter++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 2, 4, 7, 6, 9, 10};
        int n = arr.length;
        arrayEvenAndOdd(arr, n);
    }
}
