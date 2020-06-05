package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class ListPermutationsOfArray {
	public static void main(String[] args) {
		int[] inArray = {1,2,3};
		ArrayList<String> results = new ArrayList<>();
		permutations(inArray, 0, results);
		System.out.println(results);
	}

	private static void permutations(int[] inArray, int start, ArrayList<String> results) {
		if(start >= inArray.length) {
			results.add(Arrays.toString(inArray.clone())+"\n");
		} else {
			for(int i = start; i < inArray.length; i++) {
				swap(inArray, start, i);
				permutations(inArray, start + 1, results);
				swap(inArray, start, i);
			}
		}
	}

	private static void swap(int[] inArray, int i, int j) {
		int temp = inArray[i];
		inArray[i] = inArray[j];
		inArray[j] = temp;
	}
}
