package com.learning.ds.educative.dp.archived.lcs;

import java.util.Arrays;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String str1 = "abdca";
        String str2 = "cbda";

        int max = getLCSRecursive(str1, str2, 0, 0);
        System.out.println("Max LCS is: " + max);

        int[][] dp = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        max = getLCSRecursiveMemoization(str1, str2, str1.length() - 1, str2.length() - 1, dp);
        System.out.println("Max LCS is: " + max);

        max = getLCSBottomUp(str1, str2);
        System.out.println("Max LCS is: " + max);
    }

    private static int getLCSBottomUp(String str1, String str2) {
        int[][] dp = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[i].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    // This is the same condition in recursive function when the chars match.
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    // this is the same condition in the recursive call below
                    // 1) Consider 1 last character less than str1 and take the other full string
                    // 2) Consider 1 last character less than str2 and take the other full string.
                    // Visualize/draw the matrix to make more sense.
                    dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        for (int i = 0; i < dp.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[str1.length()][str2.length()];
    }

    private static int getLCSRecursiveMemoization(String str1, String str2, int index1, int index2, int[][] dp) {
        if (str1.length() == 0 || str2.length() == 0)
            return 0;
        if (index1 < 0 || index2 < 0)
            return 0;

        if (dp[index1][index2] != -1)
            return dp[index1][index2];

        if (str1.charAt(index1) == str2.charAt(index2)) {
            dp[index1][index2] = 1 + getLCSRecursiveMemoization(str1, str2, index1 - 1, index2 - 1, dp);
        } else {
            dp[index1][index2] = Math.max(getLCSRecursiveMemoization(str1, str2, index1 - 1, index2, dp),
                    getLCSRecursiveMemoization(str1, str2, index1, index2 - 1, dp));
        }
        return dp[index1][index2];
    }

    private static int getLCSRecursive(String str1, String str2, int index1, int index2) {
        if (str1.length() == 0 || str2.length() == 0)
            return 0;
        if (index1 == str1.length() || index2 == str2.length())
            return 0;

        if (str1.charAt(index1) == str2.charAt(index2)) {
            return 1 + getLCSRecursive(str1, str2, index1 + 1, index2 + 1);
        } else {
            return Math.max(getLCSRecursive(str1, str2, index1 + 1, index2),
                    getLCSRecursive(str1, str2, index1, index2 + 1));
        }
    }
}
