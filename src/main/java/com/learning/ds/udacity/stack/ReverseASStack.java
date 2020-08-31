package com.learning.ds.udacity.stack;

import java.util.Stack;

public class ReverseASStack {
    public static void main(String[] args) {
        Stack<Integer> inStack = new Stack<>();
        inStack.push(1);
        inStack.push(2);
        inStack.push(3);
        inStack.push(4);
        System.out.println(inStack.toString());
        reverse(inStack);
        System.out.println(inStack.toString());
    }

    private static void reverse(Stack<Integer> inStack) {
        if (inStack.isEmpty()) {
            return;
        }
        int poppedElement = inStack.pop();
        reverse(inStack);
        insertAtBottom(inStack, poppedElement);
    }

    private static void insertAtBottom(Stack<Integer> inStack, int element) {
        if (inStack.isEmpty()) {
            inStack.push(element);
        } else {
            int poppedElement = inStack.pop();
            insertAtBottom(inStack, element);
            inStack.push(poppedElement);
        }
    }
}
