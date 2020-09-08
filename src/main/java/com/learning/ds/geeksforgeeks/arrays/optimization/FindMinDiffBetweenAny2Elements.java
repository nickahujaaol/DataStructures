package com.learning.ds.geeksforgeeks.arrays.optimization;

//https://www.geeksforgeeks.org/find-minimum-difference-pair/
public class FindMinDiffBetweenAny2Elements {
    public static void find(int data[]) {
        int minElement = data[0];
        int minDifference = Integer.MAX_VALUE;

        for(int i = 1; i < data.length; i++) {
            minDifference = Math.min(minDifference, data[i] - minElement);
            minElement = Math.min(minElement, data[i]);
        }

        System.out.println("Minimum Difference is: "+ minDifference);
    }

    public static void main(String[] args) {
        int data[] = {1, 19, -4, 31, 38, 25, 100};
        find(data);
        //Answer : 5
    }
}
