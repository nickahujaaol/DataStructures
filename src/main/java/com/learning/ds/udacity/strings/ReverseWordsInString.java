package com.learning.ds.udacity.strings;

public class ReverseWordsInString {
	public static void main(String[] args) {
		String inString = "sihT si eno llams pets rof";
		String[] inStrings = inString.split(" ");
		String reversedWordsString = "";

		for(String stringToReverse : inStrings) {
			reversedWordsString = reversedWordsString + " " + reverse(stringToReverse);
		}

		System.out.println(reversedWordsString);
	}

	public static String reverse(String inString) {
		String reversedString = "";
		char[] inChars = inString.toCharArray();

		for(int i = inChars.length - 1; i >= 0; i--) {
			reversedString+=inChars[i];
		}
		return reversedString;
	}
}
