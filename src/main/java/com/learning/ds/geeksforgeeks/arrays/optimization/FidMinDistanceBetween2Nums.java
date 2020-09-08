package com.learning.ds.geeksforgeeks.arrays.optimization;

//https://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
public class FidMinDistanceBetween2Nums {
    public static void find(int data[], int x, int y) {
        int num1Index = -1;
        int num2Index = -1;
        int minDistance = Integer.MAX_VALUE;

        for(int i = 0; i < data.length; i++) {
            if(data[i] == x) {
                num1Index = i;
            }
            if(data[i] == y) {
                num2Index = i;
            }

            if(num1Index != -1 && num2Index != -1) {
                minDistance = Math.min(minDistance, Math.abs(num1Index - num2Index));
                num1Index = -1;
                num2Index = -1;
            }
        }

        System.out.println("Min distance is: " + minDistance);
    }

    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 5, 4, 4, 2, 3};
        find(arr, 3, 2);
        // Answer - 1
    }
}
