package com.learning.ds.geeksforgeeks.stacks;

import java.util.Stack;

//https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
public class SortAStackUsingRecursion {
    private static Stack<Integer> stack = new Stack();

    public static void insertSorted(int i) {
        if(stack.isEmpty() || stack.peek() >= i) {
            stack.push(i);
            return;
        }

        if(stack.peek() < i) {
            int poppedVal = stack.pop();
            insertSorted(i);
            stack.push(poppedVal);
        }
    }

    public static void sort() {
        if(stack.isEmpty())
            return;
        int poppedVal = stack.pop();
        sort();
        insertSorted(poppedVal);
    }

    public static void main(String[] args) {
        stack.push(3);
        stack.push(1);
        stack.push(8);
        stack.push(4);
        stack.push(88);
        stack.push(56);

        sort();
        System.out.println("Answer - " + stack.toString());
    }
}
