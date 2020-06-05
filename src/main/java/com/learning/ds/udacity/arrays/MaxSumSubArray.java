package com.learning.ds.udacity.arrays;

public class MaxSumSubArray {
	public static void main(String[] args) {
		int[] inArray = {-12, 15, -13, 14, -1, 2, 1, -5, 4};
		findSum(inArray);
	}

	private static void findSum(int[] inArray) {
		int currSum = 0;
		int maxSum = 0;

		for(int number : inArray) {
			currSum += number;
			currSum = currSum < 0 ? 0 : currSum;
			maxSum = Math.max(currSum, maxSum);
		}

		System.out.println("Max sum is : "+ maxSum);
	}
}
