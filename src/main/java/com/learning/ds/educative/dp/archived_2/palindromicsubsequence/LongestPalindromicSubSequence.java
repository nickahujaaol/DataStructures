package com.learning.ds.educative.dp.archived_2.palindromicsubsequence;

public class LongestPalindromicSubSequence {
    public static void main(String[] args) {
        String inString = "abdbca";
        int length = find(inString, 0, inString.length() - 1);
        System.out.println("Max length is: " + length);
    }

    private static int find(String inString, int start, int end) {
        if (start == end)
            return 1;
        if (start > end)
            return 0;

        if (inString.charAt(start) == inString.charAt(end))
            return 2 + find(inString, start + 1, end - 1);

        int leftCount = find(inString, start + 1, end);
        int rightCount = find(inString, start, end - 1);
        return Math.max(leftCount, rightCount);
    }
}
