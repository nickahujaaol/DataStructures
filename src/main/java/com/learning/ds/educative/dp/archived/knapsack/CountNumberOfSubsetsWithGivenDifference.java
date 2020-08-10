package com.learning.ds.educative.dp.archived.knapsack;


import java.util.Arrays;

// https://www.youtube.com/watch?v=ot_XBHyqpFc&list=PL_z_8CaSLPWekqhdCPmFohncHwz8TY2Go&index=11
public class CountNumberOfSubsetsWithGivenDifference {
    public static void main(String[] args) {
        int[] inSet = {1,1,2,3};
        int difference = 1;
        int count = findDifference(inSet, difference, 0, 0, 0);
        System.out.println("Count is: " + count);
        count = bottomsUp(inSet, difference);
        System.out.println("Count is: " + count);
    }

    /*
        sum1 + sum2 = sum   ............(1)
        sum1 - sum2 = diff  ............(2)
        Add (1) and (2)
        sum1 = (sum + diff) / 2
     */
    private static int bottomsUp(int[] inSet, int difference) {
        int sum = Arrays.stream(inSet).sum();
        int sum1 = (sum + difference) / 2;
        int[][] dp = new int[inSet.length+1][sum1 + 1];

        for (int i = 0; i <= inSet.length; i++) {
            dp[i][0] = 1;
        }

        for(int row = 1; row <= inSet.length; row++) {
            for(int col = 1; col <= sum1; col++) {
                if(col < inSet[row - 1]) {
                    dp[row][col] = dp[row - 1][col];
                } else {
                    dp[row][col] = dp[row - 1][col] +
                            dp[row - 1][col - inSet[row - 1]];
                }
            }
        }

        return dp[inSet.length][sum1];
    }

    private static int findDifference(int[] inSet, int difference, int index, int sum1, int sum2) {
        if(index == inSet.length && (Math.abs(sum1 - sum2) == difference)) {
            return 1;
        }

        if(index >= inSet.length)
            return 0;

        return findDifference(inSet, difference, index + 1, sum1 + inSet[index], sum2) +
                findDifference(inSet, difference, index + 1, sum1, sum2 + inSet[index]);
    }
}
