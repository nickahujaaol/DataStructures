package com.practice.ds.leetcode;


public class L3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String inString = "abcaxyzabcdbb";
        String longestString = find(inString);
        System.out.println(longestString);
    }

    private static String find(String inString) {
        String maxSoFar = "";
        StringBuilder builder = new StringBuilder();
        char[] inChars = inString.toCharArray();
        for(int i = 0; i < inChars.length; i++) {
            if(builder.toString().indexOf(inChars[i]) == -1) {
                builder.append(inChars[i]);
                if (builder.toString().length() > maxSoFar.length())
                    maxSoFar = builder.toString();
            } else {
                builder = new StringBuilder();
                builder.append(inChars[i]);
            }
        }

        return maxSoFar;
    }
}
