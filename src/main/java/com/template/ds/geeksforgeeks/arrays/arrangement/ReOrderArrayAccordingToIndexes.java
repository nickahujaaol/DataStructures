package com.template.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
public class ReOrderArrayAccordingToIndexes {
    public static void arrange(int data[], int index[]) {

    }

    public static void main(String[] args) {
        int arr[] = {  50, 40, 70, 60, 90};
        int index[] = {2,  0,  4,  1,  3};
        arrange(arr, index);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));
    }
}
