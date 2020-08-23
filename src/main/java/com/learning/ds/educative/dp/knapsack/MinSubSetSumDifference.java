package com.learning.ds.educative.dp.knapsack;

public class MinSubSetSumDifference {
    public static void main(String[] args) {
        int[] set = {1, 2, 3, 9};
        int minDiff = findMin(set, 0,0, set.length - 1);
        System.out.println("Min diff is: " + minDiff);
    }

    private static int findMin(int[] set, int sum1, int sum2, int index) {
        if(index < 0) {
            System.out.println(String.format("%d, %d", sum1, sum2));
            return Math.abs(sum1 - sum2);
        }


        int leftMin = findMin(set, sum1 + set[index], sum2, index - 1);
        int rightMin = findMin(set, sum1, sum2 + set[index], index - 1);
        return Math.min(leftMin, rightMin);
    }
}
