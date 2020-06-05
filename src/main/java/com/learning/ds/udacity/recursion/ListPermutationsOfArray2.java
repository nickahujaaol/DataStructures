package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ListPermutationsOfArray2 {
	public static void main(String[] args) {
		int[] inArray = {1,2,3};
		int[] tempArray = new int[inArray.length];
		List<int[]> results = new ArrayList<>();
		Stack<Integer> alreadyFixed = new Stack<>();
		findCombinations(inArray, 0, tempArray, results, alreadyFixed);
		results.stream().forEach(value ->System.out.println(Arrays.toString(value)));
	}

	private static void findCombinations(int[] inArray, int index, int[] tempArray, List<int[]> results, Stack<Integer> alreadyFixed) {
		if(index == inArray.length) {
			results.add(tempArray.clone());
		} else {
			for(int i = 0; i < inArray.length; i++) {
				if(!alreadyFixed.contains(inArray[i])) {
					tempArray[index] = inArray[i];
					alreadyFixed.push(inArray[i]);
					findCombinations(inArray, index + 1, tempArray, results, alreadyFixed);
					alreadyFixed.pop();
				}
			}
		}
	}
}
