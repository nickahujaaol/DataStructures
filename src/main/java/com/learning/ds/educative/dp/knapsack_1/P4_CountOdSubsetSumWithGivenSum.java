package com.learning.ds.educative.dp.knapsack_1;

public class P4_CountOdSubsetSumWithGivenSum {
    public static void main(String[] args) {
        int[] set = {2,3,5,6,8,10};
        int sum = 10;
        int[][] dp = new int[set.length][sum + 1];
        int count = countSubsets(set, sum, set.length - 1, dp);
        System.out.println("Count: " + count);
    }

    private static int countSubsets(int[] inSet, int sum, int index, int[][] dp) {
        if(sum == 0)
            return 1;

        if(index < 0 || sum < 0)
            return 0;

        if(sum - inSet[index] >= 0) {
            int leftCount = countSubsets(inSet, sum - inSet[index], index - 1, dp);
            int rightCount = countSubsets(inSet, sum, index - 1, dp);
            return leftCount + rightCount;
        } else {
            return countSubsets(inSet, sum, index - 1, dp);
        }
    }
}
