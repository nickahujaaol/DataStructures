package com.learning.ds.udacity.stack;

import java.util.Stack;

public class BalanceParentheses {
	private static final String OPENINT_BRACKETS = "";

	public static void main(String[] args) {
		balance("  ((32+8)∗(5/2))/(2+6)");
	}

	private static void balance(String inString) {
		Stack<Character> workingStack = new Stack();
		if(inString != null && inString.length() > 0) {
			char[] inChars = inString.toCharArray();
			for(char c : inChars) {
				if(c == '(') {
					workingStack.push('(');
				} else if(c == ')' && !workingStack.isEmpty()){
					if(!workingStack.isEmpty()) {
						char poppedChar = workingStack.pop();
						if(poppedChar != '(') {
							workingStack.push(c);
						}
					} else {
						workingStack.push(c);
					}
				}
			}
		}

		System.out.println("Is Balanced - " + workingStack.isEmpty());
	}
}
