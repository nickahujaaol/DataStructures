package com.learning.ds.educative.dp.archived.lcs;

import java.util.Arrays;

public class LongestCommonSubstring {
    public static void main(String[] args) {
        String str1 = "abcxabcd";
        String str2 = "abcyabcd";
        int max = getLCSRecursive(str1, str2, str1.length() - 1, str2.length() - 1, 0);
        System.out.println("Max is: " + max);

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        max = getLCSRecursiveMemoization(str1, str2, str1.length() - 1, str2.length() - 1, dp, 0);
        System.out.println("Max LCS is: " + max);
    }

    private static int getLCSRecursiveMemoization(String str1, String str2, int index1, int index2, int[][] dp, int count) {
        if (index1 < 0 || index2 < 0)
            return 0;

        if (dp[index1][index2] != -1)
            return dp[index1][index2];

        if (str1.charAt(index1) == str2.charAt(index2)) {
            count = getLCSRecursive(str1, str2, index1 - 1, index2 - 1, count + 1);
        }

        int leftMax = getLCSRecursiveMemoization(str1, str2, index1 - 1, index2, dp, 0);
        int rightMax = getLCSRecursiveMemoization(str1, str2, index1, index2 - 1, dp, 0);

        dp[index1][index2] = Math.max(count, Math.max(leftMax, rightMax));
        return dp[index1][index2];
    }

    private static int getLCSRecursive(String str1, String str2, int index1, int index2, int count) {
        if (index1 < 0 || index2 < 0)
            return count;

        if (str1.charAt(index1) == str2.charAt(index2)) {
            count = getLCSRecursive(str1, str2, index1 - 1, index2 - 1, count + 1);
        }

        int leftMax = getLCSRecursive(str1, str2, index1 - 1, index2, 0);
        int rightMax = getLCSRecursive(str1, str2, index1, index2 - 1, 0);

        return Math.max(count, Math.max(leftMax, rightMax));
    }
}
