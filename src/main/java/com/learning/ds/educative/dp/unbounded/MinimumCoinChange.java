package com.learning.ds.educative.dp.unbounded;

public class MinimumCoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,3};
        int total = 5;
        int minCount = getMin(coins, total, coins.length - 1);
        System.out.println("Min Count : " + minCount);
    }

    private static int getMin(int[] coins, int total, int index) {
        if(total == 0)
            return 0;

        if(index < 0)
            return Integer.MAX_VALUE;

        if(coins[index] <= total) {
            int tempSum = Integer.MAX_VALUE;
            int leftMin = getMin(coins, total - coins[index], index);
            if(leftMin != Integer.MAX_VALUE) {
                tempSum = leftMin + 1;
            }
            int rightMin = getMin(coins, total, index - 1);
            return Math.min(tempSum, rightMin);
        } else {
            return getMin(coins, total, index - 1);
        }
    }
}
