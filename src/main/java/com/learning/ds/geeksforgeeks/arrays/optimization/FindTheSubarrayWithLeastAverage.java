package com.learning.ds.geeksforgeeks.arrays.optimization;

import java.util.Arrays;

//https://www.geeksforgeeks.org/find-subarray-least-average/
public class FindTheSubarrayWithLeastAverage {
    public static void find(int data[], int sizeOfScale) {
        int currAverage = Arrays.stream(data).limit(sizeOfScale).reduce(0, (x,y) -> x + y);
        int minAverage = Integer.MAX_VALUE;

        for(int i = sizeOfScale; i < data.length; i++) {
            minAverage = Math.min(minAverage,
                    currAverage + data[i] - data[i-sizeOfScale]);
        }

        System.out.println("Min Average is: " + minAverage);
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 7, 90, 20, 10, 50, 40};
        find(arr, 3);
        //20, 10, 50
    }
}
