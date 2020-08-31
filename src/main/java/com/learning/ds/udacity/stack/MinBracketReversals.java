package com.learning.ds.udacity.stack;

import java.util.Stack;

public class MinBracketReversals {
    public static void main(String[] args) {
        findMin("{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{{}}}}}");
        findMin("}{");

    }

    private static void findMin(String inString) {
        if (inString.length() % 2 != 0) {
            System.out.println("Invalid input String...");
        }

        char[] inChars = inString.toCharArray();
        Stack<Character> workingStack = new Stack();
        for (char inChar : inChars) {
            if (!workingStack.isEmpty() && inChar == '}' && workingStack.peek() == '{') {
                workingStack.pop();
            } else {
                workingStack.push(inChar);
            }
        }

        int count = findReversals(workingStack, 0);
        System.out.println(count);
    }

    private static int findReversals(Stack<Character> workingStack, int counter) {
        if (workingStack.isEmpty()) {
            return counter;
        }

        char topValue = workingStack.pop();
        char secValue = workingStack.pop();

        if (topValue == '{' && secValue == '{') {
            counter++;
        } else if (topValue == '}' && secValue == '}') {
            counter++;
        } else if (topValue == '{' && secValue == '}') {
            counter += 2;
        }

        return findReversals(workingStack, counter);
    }
}
