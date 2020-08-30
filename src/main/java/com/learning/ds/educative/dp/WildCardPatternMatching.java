package com.learning.ds.educative.dp;

// https://www.techiedelight.com/wildcard-pattern-matching/

public class WildCardPatternMatching {
    public static void main(String[] args) {
        String inString = "xyxzzxy";
        String pattern = "x***x?";
        boolean matched = match(inString, pattern, 0, 0);
        System.out.println("Matched: " + matched);
    }

    /*
        Base Conditions:
            If both input string and pattern reaches their end, we return true.
            If only pattern reaches its end, we return false.
            If only input string reaches its end, return true only if remaining characters in the pattern are all

            //MEMOIZE for DP
     */
    private static boolean match(String input, String pattern, int inputIndex, int patternIndex) {
        if(inputIndex == input.length() && patternIndex == pattern.length())
            return true;

        if(patternIndex == pattern.length())
            return false;

        if(inputIndex == input.length()) {
            for(int i = patternIndex; i < pattern.length(); i++) {
                if(pattern.charAt(i) != '*')
                    return false;
            }
            return true;
        }

        if(input.charAt(inputIndex) == pattern.charAt(patternIndex))
            return match(input, pattern, inputIndex + 1, patternIndex + 1);

        if(pattern.charAt(patternIndex) == '?')
            return match(input, pattern, inputIndex + 1, patternIndex + 1);

        if(pattern.charAt(patternIndex) == '*')
            return match(input, pattern, inputIndex + 1, patternIndex) ||
                    match(input, pattern, inputIndex, patternIndex + 1);

        return false;
    }
}
