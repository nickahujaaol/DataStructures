package com.learning.ds.educative.dp.unbounded;

public class CoinChange {
    public static void main(String[] args) {
        int[] coins = {1, 2, 3};
        int total = 5;
        int count = getCount(coins, total, coins.length - 1);
        System.out.println("Max count is: " + count);
    }

    private static int getCount(int[] coins, int total, int index) {
        if (total == 0)
            return 1;

        if (index < 0)
            return 0;

        if (coins[index] <= total) {
            int includingCount = getCount(coins, total - coins[index], index);
            int excludingCount = getCount(coins, total, index - 1);
            return includingCount + excludingCount;
        } else {
            return getCount(coins, total, index - 1);
        }
    }
}
