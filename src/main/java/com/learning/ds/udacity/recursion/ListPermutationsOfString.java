package com.learning.ds.udacity.recursion;

import java.util.ArrayList;
/*
Problem Statement
Given an input string, return all permutations of the string in an array.

Example 1:

	string = 'ab'
	output = ['ab', 'ba']
Example 2:
	string = 'abc'
	output = ['abc', 'bac', 'bca', 'acb', 'cab', 'cba']


 */
//https://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/
public class ListPermutationsOfString {
	public static void main(String[] args) {
		String inSring = "abc";
		ArrayList<String> results = new ArrayList<>();
		permutations(inSring, 0, results);
		System.out.println(results);
	}

	private static void permutations(String inString, int start, ArrayList<String> results) {
		if(start == inString.length()) {
			results.add(inString);
		} else {
			for(int i = start; i < inString.length(); i++) {
				inString = swap(inString, start, i);
				permutations(inString, start + 1, results);
				inString = swap(inString, start, i);
			}
		}
	}

	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
