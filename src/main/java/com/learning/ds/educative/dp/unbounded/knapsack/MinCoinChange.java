package com.learning.ds.educative.dp.unbounded.knapsack;

import com.sun.org.apache.xpath.internal.axes.PredicatedNodeTest;

public class MinCoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int amount = 5;
        int minCoins = getMinRecursive(coins, amount, 0, 0);
        System.out.println("Min coins: " + minCoins);

        minCoins = getMinBottomUp(coins, amount);
        System.out.println("Min coins: " + minCoins);
    }

    private static int getMinBottomUp(int[] coins, int amount) {
        int[][] dp = new int[coins.length+1][amount+1];

        for(int i=0; i < coins.length; i++)
            for(int j=0; j <= amount; j++)
                dp[i][j] = Integer.MAX_VALUE;

        // populate the total=0 columns, as we don't need any coin to make zero total
        for(int i=0; i < coins.length; i++)
            dp[i][0] = 0;

        for(int row = 1; row <= coins.length; row++) {
            for( int col = 1; col <= amount; col++) {
                if(col < coins[row - 1]) {
                    dp[row][col] = dp[row - 1][col];
                } else {
                    int excludeCoin = dp[row - 1][col];
                    // we are adding 1 here to say that the current coin has been added
                    // and we need remaining coins need to add the the remaining amount.
                    int includeCoin = 1 + dp[row][col - coins[row - 1]];
                    dp[row][col] = Math.min(includeCoin, excludeCoin);
                }
            }
        }

        return dp[coins.length][amount];
    }

    private static int getMinRecursive(int[] coins, int amount, int index, int currAmt) {
        if(currAmt == amount)
            return 0;

        if(index >= coins.length)
            return Integer.MAX_VALUE;

        if(currAmt + coins[index] <= amount) {
            // If you assign 0 , then it may become minimum value. There was no sum found and it will override value from rightSum.
            int leftSum = Integer.MAX_VALUE;
            int tempSum = getMinRecursive(coins, amount, index, currAmt + coins[index]);
            if(tempSum != Integer.MAX_VALUE) {
                leftSum = tempSum + 1;
            }

            int rightSum = getMinRecursive(coins, amount, index + 1, currAmt);
            return Math.min(leftSum, rightSum);
        } else {
            return getMinRecursive(coins, amount, index + 1, currAmt);
        }
    }
}
