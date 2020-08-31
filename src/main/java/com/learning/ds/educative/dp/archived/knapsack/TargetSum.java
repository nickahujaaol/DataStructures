package com.learning.ds.educative.dp.archived.knapsack;

public class TargetSum {
    public static void main(String[] args) {
        int[] inSet = {1, 1, 2, 3};
        int count = findTargetSum(inSet, 1, 0, 0);
        System.out.println("Count is: " + count);
    }

    private static int findTargetSum(int[] inSet, int targetSum, int index, int currSum) {
        if (currSum == targetSum && index >= inSet.length)
            return 1;

        if (index >= inSet.length)
            return 0;

        return findTargetSum(inSet, targetSum, index + 1, currSum + inSet[index]) +
                findTargetSum(inSet, targetSum, index + 1, currSum + (inSet[index] * -1));
    }
}
