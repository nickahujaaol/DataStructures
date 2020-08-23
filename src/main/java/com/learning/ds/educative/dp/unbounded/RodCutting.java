package com.learning.ds.educative.dp.unbounded;

public class RodCutting {
    public static void main(String[] args) {
        int[] lengths = {1, 2, 3, 4, 5};
        int[] prices = {2, 6, 7, 10, 13};
        int rodLength = 5;
        int maxProfit = findMax(lengths, prices, rodLength, lengths.length - 1);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int findMax(int[] lengths, int[] prices, int rodLength, int index) {
        if(rodLength <= 0 || index < 0)
            return 0;

        if(lengths[index] <= rodLength) {
            int includeLength = prices[index] + findMax(lengths, prices, rodLength - lengths[index], index);
            int excludingLength = findMax(lengths, prices, rodLength, index - 1);
            return Math.max(includeLength, excludingLength);
        } else {
            return findMax(lengths, prices, rodLength, index - 1);
        }
    }
}
