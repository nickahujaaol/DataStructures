package com.learning.ds.udacity.strings;

import java.util.Arrays;

public class IsAnagram {
	public static void main(String[] args) {
		String inString1 = "Slotmachines".toLowerCase();
		String inString2 = "Cashlostinme".toLowerCase();

		usingSort(inString1, inString2);
		using2Arrays(inString1, inString2);
		using1Array(inString1, inString2);
	}

	//Time Complexity: O(nLogn)
	private static void usingSort(String inString1, String inString2) {
		char[] inString1Array = inString1.toCharArray();
		char[] inString2Array = inString2.toCharArray();
		Arrays.sort(inString1Array);
		Arrays.sort(inString2Array);

		inString1 = new String(inString1Array);
		inString2 = new String(inString2Array);

		System.out.println(inString1.equals(inString2));
	}

	/*
		Create count arrays of size 256 for both strings. Initialize all values in count arrays as 0.
		Iterate through every character of both strings and increment the count of character in the corresponding count arrays.
		Compare count arrays. If both count arrays are same, then return true.
	*/
	private static void using2Arrays(String inString1, String inString2) {
		int[] countArray1 = new int[256];
		int[] countArray2 = new int[256];
		boolean isAnagram =true;

		if(inString1.length() == inString2.length()) {
			for (char c : inString1.toCharArray()) {
				countArray1[c]++;
			}

			for (char c : inString2.toCharArray()) {
				countArray2[c]++;
			}

			for (int i = 0; i < countArray1.length; i++) {
				if (countArray1[i] != countArray2[i]) {
					isAnagram = false;
				}
			}
		}

		System.out.println("Is Anagram: " + isAnagram);
	}

	private static void using1Array(String inString1, String inString2) {
		int[] countArray = new int[256];
		char[] inString1Array = inString1.toCharArray();
		char[] inString2Array = inString2.toCharArray();
		boolean isAnagram = true;

		if(inString1.length() == inString2.length()) {
			for (int i = 0; i < inString1Array.length; i++) {
				countArray[inString1Array[i]]++;
				countArray[inString2Array[i]]--;
			}

			for (int i = 0; i < countArray.length; i++) {
				if (countArray[i] != 0) {
					isAnagram = false;
				}
			}
		}

		System.out.println("Is Anagram: " +isAnagram);
	}
}
