package com.template.ds.leetcode;

public class L28_ImplementStrStr {
    public static void main(String[] args) {
        int index = findIndex("helollo", "ll");
        System.out.println(index);
    }

    private static int findIndex(String hayStack, String needle) {
        int index = -1;
        int counter = 0;

        for(int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(counter)) {
                counter++;
            } else {
                counter = 0;
            }

            if(counter == needle.length()) {
                index = i - needle.length();
                break;
            }
        }
        return index;
    }
}
