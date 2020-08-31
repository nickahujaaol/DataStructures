package com.learning.ds.educative.dp.lcs;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String str1 = "abcxabcd";
        String str2 = "abcyabcd";
        int lcs = findLCS(str1, str2, str1.length() - 1, str2.length() - 1, 0);
        System.out.println("LCS is: " + lcs);
    }

    private static int findLCS(String str1, String str2, int index1, int index2, int count) {
        if (index1 < 0 || index2 < 0)
            return count;

        if (str1.charAt(index1) == str2.charAt(index2)) {
            count = findLCS(str1, str2, index1 - 1, index2 - 1, count + 1);
        }

        int leftCount = findLCS(str1, str2, index1 - 1, index2, 0);
        int rightCount = findLCS(str1, str2, index1, index2 - 1, 0);
        return Math.max(count, Math.max(leftCount, rightCount));
    }
}
