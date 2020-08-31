package com.learning.ds.geeksforgeeks.arrays.rotation;

//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

//Find the index of the minimum element, you will find he number of rotations.
public class FindRotationCountInRotatedSortedArray {
    public static int count(int[] data, int low, int high) {
        return 0;
    }

    public static void main(String[] args) {
        int[] data = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int index = count(data, 0, data.length - 1);
        System.out.println(index);
        System.out.println(data.length - index);
    }
}
