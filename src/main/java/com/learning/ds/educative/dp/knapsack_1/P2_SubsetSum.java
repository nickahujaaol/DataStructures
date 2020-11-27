package com.learning.ds.educative.dp.knapsack_1;

import java.util.Arrays;

public class P2_SubsetSum {
    public static void main(String[] args) {
        int[] set = {1, 2, 7, 1, 5};
        int sum = 10;
        boolean[][] dp = new boolean[set.length + 1][sum + 1];
        boolean exists = isSubsetPresent(set, sum, set.length - 1, dp);
        System.out.println("Partition Exists: " + exists);
    }

    private static boolean isSubsetPresent(int[] set, int sum, int index, boolean[][] dp) {
        if(index < 0 || sum < 0) {
            return false;
        }

        if(sum == 0)
            return true;

        if(dp[index][sum] != false)
            return dp[index][sum];

        if(sum - set[index] >= 0) {
            boolean leftExists = isSubsetPresent(set, sum - set[index], index - 1, dp);
            boolean rightExists = isSubsetPresent(set, sum, index - 1, dp);
            return dp[index][sum] = leftExists || rightExists;
        } else {
            return dp[index][sum] = isSubsetPresent(set, sum, index - 1, dp);
        }
    }
}
