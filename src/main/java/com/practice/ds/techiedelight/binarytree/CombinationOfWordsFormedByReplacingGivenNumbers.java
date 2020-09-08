package com.practice.ds.techiedelight.binarytree;

// https://www.techiedelight.com/combinations-of-words-formed-replacing-given-numbers-corresponding-english-alphabet/
public class CombinationOfWordsFormedByReplacingGivenNumbers {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        int[] digits = {1, 2, 2};
        findCombinations(digits, 0, "");
    }

    private static void findCombinations(int[] digits, int index, String combSoFar) {
        if(index == digits.length) {
            System.out.println(combSoFar);
            return;
        }

        int number = 0;
        for(int i = index; i < digits.length; i++) {
            number = number * 10 + digits[i];
            if(number <=26) {
                findCombinations(digits, i + 1, combSoFar + alphabets.charAt(number - 1));
            }
        }
    }
}
