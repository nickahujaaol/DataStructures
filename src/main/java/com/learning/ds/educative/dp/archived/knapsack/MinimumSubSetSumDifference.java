package com.learning.ds.educative.dp.archived.knapsack;

public class MinimumSubSetSumDifference {
    public static void main(String[] args) {
        int[] inSet = {1, 2, 3, 9};
        int minDiff = findMinDifference(inSet, 0, 0, 0);
        System.out.println("Min Diff: " + minDiff);
    }

    private static int findMinDifference(int[] inSet, int index, int sum1, int sum2) {
        if(index == inSet.length) {
            return Math.abs(sum1 - sum2);
        }

        int leftSet = findMinDifference(inSet, index + 1, sum1 + inSet[index], sum2);
        int rightSet = findMinDifference(inSet, index + 1, sum1, sum2 + inSet[index]);
        return Math.min(leftSet, rightSet);
    }
}
