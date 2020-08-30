package com.template.ds.geeksforgeeks.stacks;

import java.util.Stack;

//https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
public class SortAStackUsingRecursion {
  private static Stack<Integer> stack = new Stack();

  public static void insertSorted(int i) {

  }

  public static void sort() {

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
