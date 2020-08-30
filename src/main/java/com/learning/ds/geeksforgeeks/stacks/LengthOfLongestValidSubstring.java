package com.learning.ds.geeksforgeeks.stacks;

//https://www.geeksforgeeks.org/length-of-the-longest-valid-substring/
public class LengthOfLongestValidSubstring {
  private static final String openBrackets = "(";
  private static final String closeBrackets = ")";

  public static void find(String inString) {

  }

  private static boolean isOpen(char bracket) {
    return openBrackets.contains(""+bracket) ? true : false;
  }

  private static int openIndex(char bracket) {
    return openBrackets.indexOf(bracket);
  }

  private static int closeIndex(char bracket) {
    return closeBrackets.indexOf(bracket);
  }

  public static void main(String[] args) {
    find(")()())");
  }
}
