package com.learning.ds.educative.dp.archived.knapsack;

public class KnapSack {
    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 5};
        int[] profits = {1, 6, 10, 16};
        int capacity = 7;

        int maxProfit = knapSackRecursive(weights, profits, capacity, 0, 0);
        System.out.println("Max Profit: " + maxProfit);

        maxProfit = knapSackBottomUp(weights, profits, capacity);
        System.out.println("Max Profit: " + maxProfit);
    }

    private static int knapSackBottomUp(int[] weights, int[] profits, int capacity) {
        int[][] memoizationMatrix = new int[weights.length + 1][capacity + 1];

        for(int row = 1; row <= weights.length; row++) {
            for(int col = 1; col <= capacity; col++) {
                System.out.println(String.format("%d, %d, %d", row, col, weights[row - 1]));
                if(col < weights[row - 1]) {
                    memoizationMatrix[row][col] = memoizationMatrix[row - 1][col];
                } else {
                    int capacityIncluding = profits[row - 1] + memoizationMatrix[row - 1][col - weights[row - 1]];
                    int capacityExcluding = memoizationMatrix[row - 1][col];
                    memoizationMatrix[row][col] = Math.max(capacityIncluding, capacityExcluding);
                }
            }
        }

        return memoizationMatrix[weights.length][capacity];
    }

    private static int knapSackRecursive(int[] weights, int[] profits, int capacity, int index, int currCapacity) {
        if(index == weights.length || currCapacity >= capacity) {
            return 0;
        }
        if(currCapacity + weights[index] <= capacity) {
            int leftProfit =  profits[index] + knapSackRecursive(weights, profits, capacity, index + 1, currCapacity + weights[index]);
            int rightProfit = knapSackRecursive(weights, profits, capacity, index + 1, currCapacity);
            return Math.max(leftProfit, rightProfit);
        } else {
            return knapSackRecursive(weights, profits, capacity, index + 1, currCapacity);
        }
    }


}
