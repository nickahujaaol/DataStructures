package com.learning.ds.geeksforgeeks.arrays.optimization;

public class BestTimeToBuyAndSellStock {
    public static void maxProfit(int data[]) {
        int minPrice = data[0];
        int maxProfit = 0;

        for(int i = 1; i < data.length; i++) {
            maxProfit = Math.max(maxProfit, data[i] - minPrice);
            minPrice = Math.min(minPrice, data[i]);
        }

        System.out.println("Max profit is:" + maxProfit);
    }

    public static void main(String[] args) {
        int price[] = {2, 30, 15, 10, 8, 25, 80, 1, 76};
        maxProfit(price);
    }
}
