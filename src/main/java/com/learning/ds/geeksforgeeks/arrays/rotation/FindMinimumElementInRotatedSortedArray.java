package com.learning.ds.geeksforgeeks.arrays.rotation;

//https://www.geeksforgeeks.org/find-minimum-element-in-a-sorted-and-rotated-array/
public class FindMinimumElementInRotatedSortedArray {
    public static int find(int[] data, int low, int high) {
        if(low > high)
            return -1;
        if(data[low] > data[low + 1]){
            return data[low + 1];
        }

        int mid = (low + high) / 2;
        if(data[low] < data[mid]) {
            return find(data, mid + 1, high);
        }
        return find(data, low, mid);
    }

    public static void main(String[] args) {
        int[] data = {4,5,6, 7, 8, 9, 1, 2, 3};
        System.out.println(find(data, 0, data.length - 1));
    }
}


//2,3,4,5,6,7,8,9,1
