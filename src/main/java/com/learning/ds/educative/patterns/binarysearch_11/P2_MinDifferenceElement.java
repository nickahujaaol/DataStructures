package com.learning.ds.educative.patterns.binarysearch_11;

public class P2_MinDifferenceElement {
    public static void main(String[] args) {
        int[] data = {1,3,8,10,15};
        int key = 12;
        int number = findMinDiffIndex(data, key, 0, data.length - 1);
        System.out.println(number);
    }

    private static int findMinDiffIndex(int[] data, int key, int low, int high) {
        if(low > high)
            return -1;

        int mid = (low + high) / 2;
        if(key > data[mid] && key < data[mid + 1])
            return Math.min(Math.abs(key - data[mid]), Math.abs(key - data[mid + 1]));

        if(key > data[mid])
            return findMinDiffIndex(data, key, mid + 1, high);
        else
            return findMinDiffIndex(data, key, low, mid - 1);
    }
}
