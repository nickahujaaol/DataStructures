package com.learning.ds.educative.dp.archived.fibonacci;

import java.util.Arrays;

public class HouseThief {
    public static void main(String[] args) {
        int[] profits = {2, 5, 1, 3, 6, 2, 4};
        int maxProfit = getMaxProfitRecursive(profits, 0);
        System.out.println("Max Profit: " + maxProfit);

        maxProfit = getMaxProfitBottomUp(profits);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int getMaxProfitBottomUp(int[] profits) {
        int dp[] = new int[profits.length + 1];
        dp[0] = 0;
        dp[1] = profits[0];

        for (int i = 2; i <= profits.length; i++) {
            // See the similarity in recursive solution.
            int maxProfitIfCurrentIsRobbed = profits[i - 1] + dp[i - 2];
            int maxProfitIfCurrentIsNotRobbed = dp[i - 1];
            dp[i] = Math.max(maxProfitIfCurrentIsRobbed, maxProfitIfCurrentIsNotRobbed);
        }

        System.out.println(Arrays.toString(dp));
        return dp[profits.length];
    }

    private static int getMaxProfitRecursive(int[] profits, int index) {
        if (index >= profits.length)
            return 0;

        int leftProfit = profits[index] + getMaxProfitRecursive(profits, index + 2);
        int rightProfit = getMaxProfitRecursive(profits, index + 1);
        return Math.max(leftProfit, rightProfit);
    }
}
