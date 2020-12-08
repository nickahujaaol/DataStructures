package com.learning.ds.educative.patterns.subsets;

public class P4_StringPermutationsByChangingCase {
    public static void main(String[] args) {
        String inString = "ab7c";
        permutation(inString, 0);
    }

    private static void permutation(String inString, int index) {
        if(index >= inString.length()) {
            System.out.println(inString);
            return;
        }

        boolean isNumber = inString.charAt(index) >= '0' && inString.charAt(index) <= '9';
        if(isNumber)
            index++;

        permutation(inString, index + 1);
        String toUpperCaseCharString = changeCharToUpperCase(inString, index);
        permutation(toUpperCaseCharString, index + 1);
    }

    private static String changeCharToUpperCase(String inString, int index) {
        char[] chars = inString.toCharArray();
        chars[index] = (""+chars[index]).toUpperCase().charAt(0);
        return new String(chars);
    }
}
