package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Problem Statement
Given an integer array, find and return all the subsets of the array.
The order of subsets in the output array is not important.
However the order of elements in a particular subset should remain the same as in the input array.

Note:

An empty set will be represented by an empty list.
If there are repeat integers, each occurrence must be treated as a separate entity.
Example 1
	arr = [9, 9]

	output = [[],
			  [9],
			  [9],
			  [9, 9]]
Example 2
	arr = [9, 12, 15]

	output =  [[],
			   [15],
			   [12],
			   [12, 15],
			   [9],
			   [9, 15],
			   [9, 12],
			   [9, 12, 15]]
 */
// https://java2blog.com/find-subsets-set-power-set/
public class ReturnSubsets {
    public static void main(String[] args) {
        int[] set = {9, 12, 15};
        List<int[]> results = new ArrayList<>();
        subset(set, 0, set.length, results);
        results.stream().forEach(value -> System.out.println(Arrays.toString(value)));
    }

    private static void subset(int[] inArray, int startIndex, int endIndex, List<int[]> results) {
        if (startIndex == endIndex) {
            return;
        }
        int[] subsetArray = new int[endIndex - startIndex];
        for (int i = 0, j = startIndex; j < endIndex; i++, j++) {
            subsetArray[i] = inArray[j];
        }
        results.add(subsetArray);
        subset(inArray, startIndex + 1, endIndex, results);
        subset(inArray, startIndex, endIndex - 1, results);
    }
}
