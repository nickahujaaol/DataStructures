package com.learning.ds.ctci.arraysandstrings;

public class CheckPermutation {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "baced";
        boolean isPermutation = checkPermutation(str1, str2);
        System.out.println("Is Permutation: " + isPermutation);
    }

    private static boolean checkPermutation(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        int[] charSet = new int[26]; // There are 26 chars.... ALL small
        for(int i = 0; i < str1.length(); i++) {
            int indexValue = str1.charAt(i) - 'a';
            charSet[indexValue] = 1;
        }

        for(int i = 0; i < str2.length(); i++) {
            int indexValue = str2.charAt(i) - 'a';
            charSet[indexValue]--;
            if(charSet[indexValue] < 0)
                return false;
        }

        return true;
    }
}
