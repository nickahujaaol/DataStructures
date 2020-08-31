package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/
// Easy: you can create a new Array. Will require extra space
// Otherwise use shifting
public class RearrangeInOrder {
    public static void arrange(int data[]) {
        Arrays.sort(data);
        for(int i = 1; i < data.length; i+=2 ) {
            int temp = data[data.length - 1];
            shiftRight(data, i);
            data[i] = temp;
        }
    }

    private static void shiftRight(int[] data, int startIndex) {
        for(int i = data.length - 1; i > startIndex; i--) {
            data[i] = data[i-1];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 8, 1, 4, 2, 9, 3, 7, 6};
        arrange(arr);
        System.out.println(Arrays.toString(arr));
        //Answer - {1, 9, 2, 8, 3, 7, 4, 6, 5}
    }
}
