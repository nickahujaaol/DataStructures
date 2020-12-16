package com.finalprep.strings;

import java.util.ArrayList;
import java.util.List;

//https://javarevisited.blogspot.com/2014/03/3-ways-to-find-first-non-repeated-character-String-programming-problem.html
public class FirstNonRepeatingCharacter {
    public static void find(String inString) {
        char[] inChars = inString.toCharArray();
        List<Character> charList = new ArrayList<Character>();
        List<Character> nonRepeatingList = new ArrayList<Character>();

    }

    public static void main(String[] args) {
        String inString = "aaaabbbbbccccdeeeeefggghhh";
        find(inString);
    }
}
