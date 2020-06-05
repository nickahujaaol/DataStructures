package com.learning.ds.udacity.strings;

public class ReverseAString {
	public static void main(String[] args) {
		String inString = "water";
		String reversedString = "";
		char[] inChars = inString.toCharArray();

		for(int i = inChars.length - 1; i >= 0; i--) {
			reversedString+=inChars[i];
		}

		System.out.println(reversedString);
	}
}
