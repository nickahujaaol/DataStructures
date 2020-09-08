package com.learning.ds.geeksforgeeks.arrays.arrangement;

import java.util.Arrays;

//https://www.geeksforgeeks.org/reorder-a-array-according-to-given-indexes/
public class ReOrderArrayAccordingToIndexes {
    public static void arrange(int data[], int index[]) {
        for(int i = 0; i < index.length; i++) {
            if(i != index[i]) {
                int dataTemp = data[i];
                data[i] = data[index[i]];
                data[index[i]] = dataTemp;

                int indexTemp = index[i];
                index[i] = index[index[i]];
                index[indexTemp] = indexTemp;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {50, 40, 70, 60, 90};
        int index[] = {2, 0, 4, 1, 3};
        arrange(arr, index);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(index));
    }
}
