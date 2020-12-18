package com.practice.ds.leetcode;

public class L28_ImplementStrStr {
    public static void main(String[] args) {
        int index = findIndex("helollo", "ll");
        System.out.println(index);
    }

    private static int findIndex(String hayStack, String needle) {
        for(int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(0)) {
                boolean match = true;
                for(int j = 0; j < needle.length(); j++) {
                    if(hayStack.charAt(i+j) != needle.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if(match)
                    return i;
            }
        }
        return 0;
    }
}
