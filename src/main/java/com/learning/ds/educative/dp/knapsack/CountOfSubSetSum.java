package com.learning.ds.educative.dp.knapsack;

public class CountOfSubSetSum {
    public static void main(String[] args) {
        int[] inSet = {1, 2, 7, 1, 5};
        int count = findCount(inSet, 9, 0, 0);
        System.out.println("Count is: " + count);
        count = bottomsUp(inSet, 9);
        System.out.println("Count is: " + count);
    }

    private static int bottomsUp(int[] inSet, int givenSum) {
        int[][] dp = new int[inSet.length + 1][givenSum + 1];

        for (int i = 0; i < inSet.length; i++) {
            dp[i][0] = 1;
        }

        for(int row = 1; row <= inSet.length; row++) {
            for(int sum = 1; sum <= givenSum; sum++) {
                if(sum < inSet[row - 1]) {
                    dp[row][sum] = dp[row - 1][sum];
                } else {
                    dp[row][sum] = dp[row - 1][sum] + dp[row - 1][sum - inSet[row - 1]];
                }
            }
        }

        return dp[inSet.length][givenSum];
    }

    private static int findCount(int[] inSet, int givenSum, int index, int currSum) {
        if(currSum == givenSum)
            return 1;
        if(index == inSet.length)
            return 0;

        if(currSum + inSet[index] <= givenSum) {
            return findCount(inSet, givenSum, index + 1, currSum + inSet[index]) +
                    findCount(inSet, givenSum, index + 1, currSum);
        } else {
            return findCount(inSet, givenSum, index + 1, currSum);
        }
    }
}
