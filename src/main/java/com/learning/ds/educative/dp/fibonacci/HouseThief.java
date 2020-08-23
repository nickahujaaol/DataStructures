package com.learning.ds.educative.dp.fibonacci;

public class HouseThief {
    public static void main(String[] args) {
        int[] profits = {2, 5, 1, 3, 6, 2, 4};
        int maxProfit = maxProfit(profits, 0);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int maxProfit(int[] profits, int index) {
        if(index >= profits.length)
            return 0;

        int robMax = profits[index] + maxProfit(profits, index + 2);
        int notRobMax = maxProfit(profits, index + 1);
        return Math.max(robMax, notRobMax);
    }
}
