package com.learning.ds.educative.dp.palindromicsubsequence;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        String inString = "abdbcaac";
        int length = find(inString, 0, inString.length() - 1, 0);
        System.out.println("Max length is: " + length);

        length = findBookish(inString, 0, inString.length() - 1);
        System.out.println("Book way: Max length is: " + length);
    }

    private static int findBookish(String inString, int start, int end) {
        if (start == end)
            return 1;

        if (start > end)
            return 0;

        if (inString.charAt(start) == inString.charAt(end)) {
            int assumedRemainingLength = end - start - 1;
            int foundRemainingLength = findBookish(inString, start + 1, end - 1);
            if (assumedRemainingLength == foundRemainingLength) {
                return 2 + foundRemainingLength;
            }
        }

        int leftCount = find(inString, start + 1, end, 0);
        int rightCount = find(inString, start, end - 1, 0);

        return Math.max(leftCount, rightCount);
    }

    private static int find(String inString, int start, int end, int count) {
        if (start == end)
            return 1 + count;
        if (start > end)
            return count;

        if (inString.charAt(start) == inString.charAt(end))
            count = find(inString, start + 1, end - 1, count + 2);

        int leftCount = find(inString, start + 1, end, 0);
        int rightCount = find(inString, start, end - 1, 0);

        return Math.max(count, Math.max(leftCount, rightCount));
    }
}
