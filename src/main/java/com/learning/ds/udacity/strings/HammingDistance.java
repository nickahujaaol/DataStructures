package com.learning.ds.udacity.strings;

/*
In information theory, the Hamming distance between two strings of equal length is the number of positions
at which the corresponding symbols are different. Calculate the Hamming distace for the following test cases.
 */
public class HammingDistance {
	public static void main(String[] args) throws Exception {
		String inString1 = "A gentleman";
		String inString2 = "Elegant men";
		int count = 0;

		if(inString1.length() != inString2.length()) {
			throw new Exception();
		}

		char[] inString1Chars = inString1.toCharArray();
		char[] inString2Chars = inString2.toCharArray();

		for(int i = 0; i < inString1Chars.length; i++) {
			if(inString1Chars[i] != inString2Chars[i]) {
				count++;
			}
		}

		System.out.println("Hamming Distance is:" + count);

	}
}
