package com.learning.ds.educative.patterns.twopointers;

import java.util.Arrays;

public class P4_DutchNationalFlag {
    public static void main(String[] args) {
        int[] data = {0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1, 0};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    private static void sort(int[] data) {
        int start = 0;
        int mid = 0;
        int end = data.length - 1;
        int pivot = 1;

        while (mid <= end) {
            if(data[mid] < pivot) {
                int temp = data[start];
                data[start] = data[mid];
                data[mid] = temp;
                start++;
                mid++;
            } else if(data[mid] == pivot) {
                mid++;
            } else {
                int temp = data[end];
                data[end] = data[mid];
                data[mid] = temp;
                end--;
            }
        }
    }
}
