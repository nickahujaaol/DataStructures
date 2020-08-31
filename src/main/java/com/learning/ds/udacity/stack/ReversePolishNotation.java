package com.learning.ds.udacity.stack;

import java.util.Stack;

public class ReversePolishNotation {
    private static final String OPERATORS = "+-*/";

    public static void main(String[] args) {
        convert("31+4*", 16);
    }

    private static void convert(String inString, int ans) {
        if (inString != null) {
            char[] inChars = inString.toCharArray();
            Stack<Integer> workingStack = new Stack<>();
            for (char inChar : inChars) {
                if (OPERATORS.contains("" + inChar) && workingStack.size() >= 2) {
                    int calculatedValue = 0;
                    int value1 = workingStack.pop();
                    int value2 = workingStack.pop();
                    if (inChar == '+') {
                        calculatedValue = value1 + value2;
                    } else if (inChar == '-') {
                        calculatedValue = value1 - value2;
                    } else if (inChar == '*') {
                        calculatedValue = value1 * value2;
                    } else if (inChar == '/') {
                        calculatedValue = value1 / value2;
                    }
                    workingStack.push(calculatedValue);
                } else {
                    workingStack.push(Integer.parseInt("" + inChar));
                }
            }

            System.out.println("Final Ans: " + workingStack.pop());
        }
    }
}
