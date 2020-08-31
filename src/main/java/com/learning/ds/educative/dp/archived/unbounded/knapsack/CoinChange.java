package com.learning.ds.educative.dp.archived.unbounded.knapsack;

import java.util.Arrays;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int amount = 5;
        int numOfWays = getWaysRecursive(coins, amount, 0, 0);
        System.out.println("Num of Ways: " + numOfWays);

        numOfWays = getWaysBottomUp(coins, amount);
        System.out.println("Num of Ways: " + numOfWays);
    }

    private static int getWaysBottomUp(int[] coins, int amount) {
        int[][] dp = new int[coins.length + 1][amount + 1];

        for (int i = 0; i <= coins.length; i++) {
            dp[i][0] = 1;
        }

        for (int coin = 1; coin <= coins.length; coin++) {
            for (int currAmt = 1; currAmt <= amount; currAmt++) {
                if (currAmt < coins[coin - 1]) {
                    dp[coin][currAmt] = dp[coin - 1][currAmt];
                } else {
                    int waysIncluding = dp[coin][currAmt - coins[coin - 1]];
                    int wayExcluding = dp[coin - 1][currAmt];
                    dp[coin][currAmt] = waysIncluding + wayExcluding;
                }
            }
        }

        for (int i = 0; i <= coins.length; i++) {
            System.out.println(Arrays.toString(dp[i]));
        }

        return dp[coins.length][amount];
    }

    private static int getWaysRecursive(int[] coins, int amount, int index, int currAmount) {
        if (currAmount == amount)
            return 1;
        if (index >= coins.length)
            return 0;

        if (coins[index] + currAmount <= amount) {
            int leftWays = getWaysRecursive(coins, amount, index, currAmount + coins[index]);
            int rightWays = getWaysRecursive(coins, amount, index + 1, currAmount);
            return leftWays + rightWays;
        } else {
            return getWaysRecursive(coins, amount, index + 1, currAmount);
        }
    }
}
