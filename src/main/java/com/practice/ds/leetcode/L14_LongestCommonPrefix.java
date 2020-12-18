package com.practice.ds.leetcode;

public class L14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String prefix = findPrefix(strs);
        System.out.println(prefix);
    }

    private static String findPrefix(String[] inStrs) {
        String firstString = inStrs[0];

        String prefix = "";

        for(int i = 0; i < firstString.length(); i++) {
            boolean charPresent = true;
            char charToFind = firstString.charAt(i);
            for(int j = 0; j < inStrs.length; j++) {
                if(i >= inStrs[j].length() || inStrs[j].charAt(i) != charToFind) {
                    charPresent = false;
                    break;
                }
            }

            if(charPresent)
                prefix += charToFind;
        }
        return prefix;
    }
}
