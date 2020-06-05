package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
import java.util.List;

public class KeyPadCombinations {
	public static void main(String[] args) {
		List<String> results = new ArrayList<>();
		char[] inNumber = "234".toCharArray();
		char[] tempArray = new char[inNumber.length];
		findCombinations(inNumber, 0, tempArray, results);
		System.out.println(results);
	}

	private static void findCombinations(char inNumber[], int index, char[] tempArray, List<String> results) {
		if(index >= inNumber.length) {
			results.add(new String(tempArray));
		} else {
			int indexNum = Integer.parseInt("" + inNumber[index]);
			String indexChars = getCharacters(indexNum);
			char[] indexCharArray = indexChars.toCharArray();
			for (int i = 0; i < indexChars.length(); i++) {
				tempArray[index] = indexCharArray[i];
				findCombinations(inNumber, index + 1, tempArray, results);
			}
		}
	}

	private static String getCharacters(int number) {
		switch (number) {
			case 2:
				return "abc";
			case 3:
				return "def";
			case 4:
				return "ghi";
			case 5:
				return "jkl";
			case 6:
				return "mno";
			case 7:
				return "pqrs";
			case 8:
				return "tuv";
			case 9:
				return "wxyz";
			default:
				return "";
		}
	}
}
