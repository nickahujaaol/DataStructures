package com.learning.ds.udacity.recursion;

/*
Problem statement
Given an array arr and a target element target, find the last index of occurance of target in arr using recursion. If target is not present in arr, return -1.

For example:

For arr = [1, 2, 5, 5, 1, 2, 5, 4] and target = 5, output = 6

For arr = [1, 2, 5, 5, 1, 2, 5, 4] and target = 7, output = -1
 */
public class LastIndex {
    public static void main(String[] args) {
        int[] inArray = {1, 2, 5, 5, 1, 2, 5, 4};
        System.out.println(getIndex(inArray, 5, 0, -1));
    }

    private static int getIndex(int[] inArray, int target, int start, int index) {
        if(start == inArray.length) return index;
        if(inArray[start] == target) {
            index = start;
        }
        return getIndex(inArray, target, start + 1, index);
    }
}
