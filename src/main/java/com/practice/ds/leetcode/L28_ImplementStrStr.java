package com.practice.ds.leetcode;

public class L28_ImplementStrStr {
    public static void main(String[] args) {
        int index = findIndex("HellHelloWorld", "asd");
        System.out.println(index);
    }

    private static int findIndex(String hayStack, String needle) {
        int index = -1;
        int counter = 0;

        boolean found = false;
        for(int i = 0; i < hayStack.length(); i++) {
            if(hayStack.charAt(i) == needle.charAt(counter)) {
                counter++;
                found = true;
            } else {
                counter = 0;
                if(found) {
                    i--;
                    found = false;
                }
            }

            if(counter == needle.length()) {
                index = i - needle.length() + 1;
                break;
            }
        }
        return index;
    }
}

