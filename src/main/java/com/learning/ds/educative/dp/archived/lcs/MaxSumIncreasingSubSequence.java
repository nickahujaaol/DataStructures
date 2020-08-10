package com.learning.ds.educative.dp.archived.lcs;

import java.util.Arrays;

public class MaxSumIncreasingSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4,1,2,6,10,1,12};

        //We are incrementing it by 1 because prev index starts from -1.
        int[][] dp = new int[inArray.length][inArray.length + 1];
        for(int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        int maxSeq = findLISRecursive(inArray, 0, -1, 0);
        System.out.println("Max LIS is: " + maxSeq);

    }

    private static int findLISRecursive(int[] inArray, int currIndex, int prevIndex, int sum) {
        if(currIndex == inArray.length)
            return sum;

        int includingSum = sum;
        if(prevIndex == -1 || inArray[currIndex] > inArray[prevIndex])
            includingSum = findLISRecursive(inArray, currIndex + 1, currIndex, inArray[currIndex] + sum);

        int excludingSum = findLISRecursive(inArray, currIndex + 1, prevIndex, sum);
        return Math.max(includingSum, excludingSum);
    }

}
