package com.learning.ds.educative.dp.unbounded;

public class P1_RodCutting {
    public static void main(String[] args) {
        int[] lengths = {1, 2, 3, 4, 5};
        int[] prices = {2, 6, 7, 10, 13};
        int rodLength = 5;
        int maxProfit = findMax(lengths, prices, rodLength, lengths.length - 1);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int findMax(int[] lengths, int[] prices, int rodLength, int index) {
        if(index < 0)
            return 0;
        if(index == 0 && rodLength == 0)
            return 0;

        if(rodLength - lengths[index] >= 0) {
            int leftMaxProfit = prices[index] + findMax(lengths, prices, rodLength - lengths[index], index);
            int rightMaxProfit = findMax(lengths, prices, rodLength, index - 1);
            return Math.max(leftMaxProfit, rightMaxProfit);
        } else {
            return findMax(lengths, prices, rodLength, index - 1);
        }
    }
}
