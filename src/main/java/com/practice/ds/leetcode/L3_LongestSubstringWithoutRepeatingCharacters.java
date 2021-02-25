package com.practice.ds.leetcode;

public class L3_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String inStr = "abcabcdbb";
        int length = find(inStr);
        System.out.println(length);
    }

    private static int find(String inStr) {
        String tempStr = "";
        int maxLength = Integer.MIN_VALUE;

        for(int i = 0; i < inStr.length(); i++) {
            if(tempStr.indexOf(inStr.charAt(i)) != -1) {
                tempStr = tempStr.substring(tempStr.indexOf(inStr.charAt(i)) + 1, tempStr.length());
                tempStr+=inStr.charAt(i);
            } else {
                tempStr+=inStr.charAt(i);
                maxLength = Math.max(maxLength, tempStr.length());
            }
        }
        return maxLength;
    }
}
