package com.learning.ds.educative.dp.fibonacci;

public class P6_HouseThief {
    public static void main(String[] args) {
        int[] money = {2,5,1,3,6,2,4};
        int profit = getProfit(money, 0);
        System.out.println("Profit is: " + profit);
    }

    private static int getProfit(int[] money, int index) {
        if(index >= money.length)
            return 0;

        int robProfit = money[index] + getProfit(money, index + 2);
        int noRobProfit = getProfit(money, index + 1);
        return Math.max(robProfit, noRobProfit);
    }
}
