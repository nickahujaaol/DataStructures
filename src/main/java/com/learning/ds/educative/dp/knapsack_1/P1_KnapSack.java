package com.learning.ds.educative.dp.knapsack_1;

public class P1_KnapSack {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 7;
        int[][] dp = new int[weights.length + 1][capacity + 1];
        int maxProfit = knapSackRecursive(weights, profits, capacity, 0, 0, dp);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int knapSackRecursive(int[] weights, int[] profits, int capacity, int index, int currentCapacity, int[][] dp) {
        if(index == weights.length || currentCapacity >= capacity) {
            return 0;
        }

        if(dp[index][currentCapacity] != 0)
            return dp[index][currentCapacity];

        if(currentCapacity + weights[index] <= capacity) {
            int includingMax = profits[index] + knapSackRecursive(weights, profits, capacity, index + 1, currentCapacity + weights[index], dp);
            int excludingMax = knapSackRecursive(weights, profits, capacity, index + 1, currentCapacity, dp);
            return dp[index][currentCapacity] = Math.max(includingMax, excludingMax);
        } else {
            return dp[index][currentCapacity] = knapSackRecursive(weights, profits, capacity, index + 1, weights[index], dp);
        }
    }
}
