package com.template.ds.geeksforgeeks.stacks;

import java.util.Stack;

//https://www.geeksforgeeks.org/sort-stack-using-temporary-stack/
public class SortAStackUsingTempStack {
    static Stack<Integer> origStack = new Stack<Integer>();
    static Stack<Integer> resultStack = new Stack<Integer>();


    public static void sort() {

    }

    public static void main(String[] args) {
        origStack.push(3);
        origStack.push(1);
        origStack.push(8);
        origStack.push(4);
        origStack.push(88);
        origStack.push(56);

        sort();
        System.out.println("Answer - " + resultStack.toString());
    }

}
