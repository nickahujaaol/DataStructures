package com.learning.ds.educative.dp.knapsack_1;

import java.util.stream.IntStream;

public class P3_EqualSubsetSumPartition {
    public static void main(String[] args) {
        int[] inSet = {1, 1, 3, 4, 7};
        int findSum = IntStream.of(inSet).sum();
        boolean isPresent = isEqualSubsetPresent(inSet, findSum / 2, 0, 0);
        System.out.println("Is Present: " + isPresent);

    }

    private static boolean isEqualSubsetPresent(int[] inSet, int targetSum, int index, int currSum) {
        if(index >= inSet.length || currSum > targetSum)
            return false;

        if(currSum == targetSum)
            return true;

        if(currSum + inSet[index] <= targetSum) {
            boolean leftExists = isEqualSubsetPresent(inSet, targetSum, index + 1, currSum + inSet[index]);
            boolean rightExists = isEqualSubsetPresent(inSet, targetSum, index + 1, currSum);
            return leftExists || rightExists;
        } else {
            return isEqualSubsetPresent(inSet, targetSum, index + 1, currSum);
        }
    }
}
