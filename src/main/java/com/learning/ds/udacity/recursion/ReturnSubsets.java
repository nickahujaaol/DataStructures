package com.learning.ds.udacity.recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://java2blog.com/find-subsets-set-power-set/
public class ReturnSubsets {
	public static void main(String[] args) {
		int[] set = {9,12,15};
		List<int[]> results = new ArrayList<>();
		subset(set, 0, set.length, results);
		results.stream().forEach(value ->System.out.println(Arrays.toString(value)));
	}

	private static void subset(int[] inArray, int startIndex, int endIndex, List<int[]> results) {
		if(startIndex == endIndex) {
			return;
		}
		int[] subsetArray = new int[endIndex - startIndex];
		for(int i = 0, j = startIndex; j < endIndex; i++, j++) {
			subsetArray[i] = inArray[j];
		}
		results.add(subsetArray);
		subset(inArray, startIndex + 1, endIndex, results);
		subset(inArray, startIndex, endIndex - 1, results);
	}
}
