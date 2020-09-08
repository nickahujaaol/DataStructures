package com.learning.ds.ctci.arraysandstrings;

public class PalindromePermutation {
    public static void main(String[] args) {
        String inStr = "tactcoa";
        boolean isPermutation = isPalindromePermutation(inStr);
        System.out.println("Is Palindrome Permutation: " + isPermutation);
    }

    private static boolean isPalindromePermutation(String inStr) {
        int[] table = new int[26];
        int countOdd = 0;

        for(int i = 0; i < inStr.length(); i++) {
            int indexValue = inStr.charAt(i) - 'a';
            table[indexValue]++;
            if(table[indexValue] % 2 == 1) {
                countOdd++;
            } else {
                countOdd--;
            }
        }

        return countOdd <= 1;
    }
}
