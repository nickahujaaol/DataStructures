package com.learning.ds.educative.dp.archived.knapsack;

public class SubsetSum {
    public static void main(String[] args) {
        int[] inSet = {1, 2, 3, 7};
        boolean isPresent = isSubsetPresent(inSet, 6, 0, 0);
        System.out.println("Is Present: " + isPresent);
        isPresent = bottomsUp(inSet, 6);
        System.out.println("Is Present: " + isPresent);
    }

    private static boolean bottomsUp(int[] inSet, int givenSum) {
        boolean[][] dp = new boolean[inSet.length + 1][givenSum + 1];

        for (int i = 0; i < inSet.length; i++) {
            dp[i][0] = true;
        }

        for(int row = 1; row <= inSet.length; row++) {
            for(int sum = 1; sum <= givenSum; sum++) {
                if(sum < inSet[row - 1]) {
                    dp[row][sum] = dp[row - 1][sum];
                } else {
                    dp[row][sum] = dp[row - 1][sum - inSet[row - 1]];
                }
            }
        }

        return dp[inSet.length][givenSum];
    }

    private static boolean isSubsetPresent(int[] inSet, int sum, int index, int currSum) {
        if(sum == currSum) {
            return true;
        }

        if(index == inSet.length || currSum >= sum) {
            return false;
        }

        if(currSum + inSet[index] <= sum) {
            return isSubsetPresent(inSet, sum, index + 1, inSet[index] + currSum) ||
                    isSubsetPresent(inSet, sum, index + 1, currSum);
        } else {
            return isSubsetPresent(inSet, sum, index + 1, currSum);
        }
    }
}
