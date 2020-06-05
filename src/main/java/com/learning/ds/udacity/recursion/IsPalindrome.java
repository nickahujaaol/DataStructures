package com.learning.ds.udacity.recursion;

public class IsPalindrome {
	public static void main(String[] args) {
		boolean ans = isPalindrome("A");
		System.out.println(ans);
	}

	private static boolean isPalindrome(String inString) {
		if(inString.length() <= 1) {
			return true;
		} else {
			int startIndex = inString.length() > 1 ? 1 : 0;
			int endIndex = inString.length() - 1;
			return inString.charAt(0) == inString.charAt(inString.length() - 1)
					&& isPalindrome(inString.substring(startIndex, endIndex));
		}
	}
}
