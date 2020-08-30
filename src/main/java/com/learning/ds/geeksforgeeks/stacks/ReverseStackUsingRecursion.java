package com.learning.ds.geeksforgeeks.stacks;

import java.util.Stack;

//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
public class ReverseStackUsingRecursion {
  static Stack<Character> stack = new Stack<Character>();

  public static void reverse() {

  }

  public static void main(String[] args) {
    stack.push('1');
    stack.push('2');
    stack.push('3');
    stack.push('4');

    System.out.println("Original Stack");

    System.out.println(stack);

    // function to reverse
    // the stack
    reverse();

    System.out.println("Reversed Stack");

    System.out.println(stack);
  }
}
