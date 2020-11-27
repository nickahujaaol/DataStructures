package com.learning.ds.educative.dp.unbounded;

public class P3_MinimumCoinChange {
    public static void main(String[] args) {
        int[] coins = {4,3,2};
        int total = 5;
        int minCount = getMin(coins, total, coins.length - 1);
        System.out.println("Min Count : " + minCount);
    }

    private static int getMin(int[] coins, int totalAmount, int index) {
        if(index < 0)
            return Integer.MAX_VALUE;
        if(totalAmount == 0)
            return 0;

        if(totalAmount - coins[index] >= 0) {
            int leftMin = getMin(coins, totalAmount - coins[index], index);
            if(leftMin != Integer.MAX_VALUE)
                leftMin = leftMin + 1;
            int rightMin = getMin(coins, totalAmount, index - 1);
            return Math.min(leftMin, rightMin);
        } else {
            return getMin(coins, totalAmount, index - 1);
        }
    }
}
