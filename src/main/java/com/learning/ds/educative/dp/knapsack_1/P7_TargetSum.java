package com.learning.ds.educative.dp.knapsack_1;

public class P7_TargetSum {
    public static void main(String[] args) {
        int[] inSet = {1, 1, 2, 3};
        int count = findTargetSum(inSet, 1, 0, 0);
        System.out.println("Count is: " + count);
    }

    private static int findTargetSum(int[] inSet, int targetSum, int index, int currSum ) {
        if(index == inSet.length && currSum == targetSum)
            return 1;

        if(index >= inSet.length)
            return 0;

        int leftSum = findTargetSum(inSet, targetSum, index + 1, -1 * (currSum + inSet[index]));
        int rightSum = findTargetSum(inSet, targetSum, index + 1, currSum + inSet[index]);
        return leftSum + rightSum;
    }
}
