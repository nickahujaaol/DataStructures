package com.learning.ds.educative.dp.knapsack;

public class KnapSack {
    public static void main(String[] args) {
        int[] profits = {1, 6, 10, 16};
        int[] weights = {1, 2, 3, 5};
        int capacity = 7;
        int[][] dp = new int[profits.length + 1][capacity + 1];
        int maxProfit = getMaxProfit(profits, weights, capacity, profits.length - 1, dp);
        System.out.println("Max Profit is: " + maxProfit);
    }

    private static int getMaxProfit(int[] profits, int[] weights, int capacity, int index, int[][] dp) {
        if(index < 0)
            return 0;

        if(dp[index][capacity] != 0)
            return dp[index][capacity];

        if(weights[index] <= capacity) {
            int includingMax = profits[index] + getMaxProfit(profits, weights, capacity - weights[index], index - 1, dp);
            int excludingMax = getMaxProfit(profits, weights, capacity, index - 1, dp);
            return dp[index][capacity] = Math.max(includingMax, excludingMax);
        } else {
            return dp[index][capacity] = getMaxProfit(profits, weights, capacity, index - 1, dp);
        }
    }
}
