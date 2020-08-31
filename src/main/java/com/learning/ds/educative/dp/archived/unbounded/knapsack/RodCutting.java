package com.learning.ds.educative.dp.archived.unbounded.knapsack;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {
        int[] lengths = {1, 2, 3, 4, 5};
        int[] prices = {2, 6, 7, 10, 13};
        int rodLength = 5;

        int[][] dp = new int[lengths.length + 1][rodLength + 1];
        for (int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        int maxProfit = getMaxProfitRecursive(lengths, prices, rodLength, 0, dp);
        System.out.println("Max Profit is: " + maxProfit);

        maxProfit = getMaxProfitBottomUp(lengths, prices, rodLength);
        System.out.println("Max Profit is: " + maxProfit);
    }

    private static int getMaxProfitBottomUp(int[] lengths, int[] prices, int rodLength) {
        int[][] dp = new int[lengths.length + 1][rodLength + 1];

        for (int length = 1; length <= lengths.length; length++) {
            for (int currRodLength = 1; currRodLength <= rodLength; currRodLength++) {
                if (currRodLength < lengths[length - 1]) {
                    dp[length][currRodLength] = dp[length - 1][currRodLength];
                } else {
                    int profitIncluding = prices[length - 1] + dp[length][currRodLength - lengths[length - 1]];
                    int profitExcluding = dp[length - 1][currRodLength];
                    dp[length][currRodLength] = Math.max(profitIncluding, profitExcluding);
                }
            }
        }

        return dp[lengths.length][rodLength];
    }

    private static int getMaxProfitRecursive(int[] lengths, int[] prices, int rodLength, int index, int[][] dp) {
        if (rodLength == 0 || index >= lengths.length)
            return 0;

        if (dp[index][rodLength] != -1)
            return dp[index][rodLength];

        if (lengths[index] <= rodLength) {
            int profitIncluding = prices[index] + getMaxProfitRecursive(lengths, prices, rodLength - lengths[index], index, dp);
            int profitExcluding = getMaxProfitRecursive(lengths, prices, rodLength, index + 1, dp);
            return dp[index][rodLength] = Math.max(profitIncluding, profitExcluding);
        } else {
            return dp[index][rodLength] = getMaxProfitRecursive(lengths, prices, rodLength, index + 1, dp);
        }
    }
}
