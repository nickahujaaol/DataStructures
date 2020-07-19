package com.learning.ds.techiedelight.binarytree;

// https://www.techiedelight.com/combinations-of-words-formed-replacing-given-numbers-corresponding-english-alphabet/
public class CombinationOfWordsFormedByReplacingGivenNumbers {
    private static final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        int[] digits = {1,2,2};
        findCombinations(digits, 0, "");
    }

    private static void findCombinations(int[] digits, int index, String combSoFar) {
        if(index == digits.length) {
            System.out.println(combSoFar);
            return;
        }

        int sum = 0;
        for(int i = index; i <= Math.min(index + 1, digits.length - 1); i++) {
            sum = sum * 10 + digits[i];
            if(sum > 0 && sum <= 26) {
                char charToAdd = alphabets.charAt(sum - 1);
                findCombinations(digits, i + 1, combSoFar + charToAdd);
            }

        }
    }
}
