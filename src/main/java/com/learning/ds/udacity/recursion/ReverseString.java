package com.learning.ds.udacity.recursion;

public class ReverseString {
	public static void main(String[] args) {
		String ans = reverse("abc");
		System.out.println(ans);
	}

	private static String reverse(String inString) {
		if(inString == null || inString.length() == 0) {
			return "";
		} else {
			String lastChar = inString.substring(inString.length() - 1, inString.length());
			return lastChar + reverse(inString.substring(0, inString.length() - 1));
		}
	}
}
