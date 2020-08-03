package com.learning.ds.educative.dp.unbounded.knapsack;

import java.util.Arrays;

public class RodCutting {
    public static void main(String[] args) {
        int[] lengths = {1, 2, 3, 4, 5};
        int[] prices = {2, 6, 7, 10, 13};
        int rodLength = 5;

        int maxProfit = getMaxProfitRecursive(lengths, prices, rodLength, 0, 0);
        System.out.println("Max Profit is: " + maxProfit);

        maxProfit = getMaxProfitBottomUp(lengths, prices, rodLength);
        System.out.println("Max Profit is: " + maxProfit);
    }

    private static int getMaxProfitBottomUp(int[] lengths, int[] prices, int rodLength) {
        int[][] dp = new int[lengths.length + 1][rodLength + 1];

        for(int length = 1; length <= lengths.length; length++) {
            for(int currRodLength = 1; currRodLength <= rodLength; currRodLength++) {
                if(currRodLength < lengths[length - 1]) {
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

    private static int getMaxProfitRecursive(int[] lengths, int[] prices, int rodLength, int index, int currRodLength) {
        if(currRodLength == rodLength || index >= lengths.length)
            return 0;

        if(lengths[index] + currRodLength <= rodLength) {
            int profitIncluding = prices[index] + getMaxProfitRecursive(lengths, prices, rodLength, index, currRodLength + lengths[index]);
            int profitExcluding = getMaxProfitRecursive(lengths, prices, rodLength, index + 1, currRodLength);
            return Math.max(profitIncluding, profitExcluding);
        } else {
            return getMaxProfitRecursive(lengths, prices, rodLength, index + 1, currRodLength);
        }
    }
}
