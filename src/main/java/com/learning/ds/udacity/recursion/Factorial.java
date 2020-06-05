package com.learning.ds.udacity.recursion;

public class Factorial {
	public static void main(String[] args) {
		int ans = findFact(5);
		System.out.println(ans);
	}

	private static int findFact(int number) {
		if(number == 0) return 1;
		else return number * findFact(number - 1);
	}
}
