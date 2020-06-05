package com.learning.ds.udacity.recursion;

import java.util.Arrays;

public class AddOne {
	public static void main(String[] args) {
		int[] inArray = {9,9,9};
		int carryOver = addOne(inArray, 0);
		int[] newArray = inArray;
		if(carryOver > 0) {
			newArray = new int[inArray.length + 1];
			newArray[0] = carryOver;
			for(int i = 0; i < inArray.length; i++) {
				newArray[i+1] = inArray[i];
			}
		}
		System.out.println(Arrays.toString(newArray));
	}

	private static int addOne(int[] inArray, int index) {
		if(index == inArray.length - 1) {
			int carryOver = (inArray[index] + 1) / 10;
			inArray[index] = (inArray[index] + 1) % 10;
			return carryOver;
		} else {
			int carryOver = addOne(inArray, index + 1);
			carryOver = (inArray[index] + carryOver) / 10;
			inArray[index] = (inArray[index] + carryOver) % 10;
			return carryOver;
		}
	}
}
