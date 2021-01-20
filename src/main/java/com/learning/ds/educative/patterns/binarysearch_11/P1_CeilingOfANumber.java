package com.learning.ds.educative.patterns.binarysearch_11;

public class P1_CeilingOfANumber {
    public static void main(String[] args) {
        int[] data = {1,3,5,7,9,11,13,15,17,19};
        int key = 16;
        int number = ceiling(data, key, 0, data.length - 1);
        System.out.println(number);
    }

    private static int ceiling(int[] data, int key, int low, int high) {
        if(low > high)
            return 0;

        int mid = (low + high) / 2;

        if(data[mid] == key)
            return data[mid];
        if(key > data[mid] && key < data[mid+1])
            return data[mid + 1];

        if(key > data[mid])
            return ceiling(data, key, mid + 1, high);
        else
            return ceiling(data, key, low, mid - 1);
    }
}
