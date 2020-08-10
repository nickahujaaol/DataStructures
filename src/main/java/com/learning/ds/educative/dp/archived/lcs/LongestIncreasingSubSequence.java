package com.learning.ds.educative.dp.archived.lcs;

import java.util.Arrays;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4,2,3,6,10,1,12};

        //We are incrementing it by 1 because prev index starts from -1.
        int[][] dp = new int[inArray.length][inArray.length + 1];
        for(int i = 0; i < dp.length; i++)
            Arrays.fill(dp[i], -1);
        int maxSeq = findLISRecursive(inArray, 0, -1, dp);
        System.out.println("Max LIS is: " + maxSeq);

        maxSeq = getLISBottomUp(inArray);
        System.out.println("Max LIS is: " + maxSeq);
    }

    //O(n2)
    private static int getLISBottomUp(int[] inArray) {
        int[] dp = new int[inArray.length];
        Arrays.fill(dp, 1);
        int maxLength = 1;
        for(int i = 1; i < inArray.length; i++) {
            for(int j = 0; j < i; j++) {
                if(inArray[j] <= inArray[i] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }

        System.out.println(Arrays.toString(dp));
        return maxLength;
    }

    private static int findLISRecursive(int[] inArray, int currIndex, int prevIndex, int[][] dp) {
        if(currIndex == inArray.length)
            return 0;

        //PRE INDEX STARTS WITH -1, HENCE ADD 1 TO IT.
        if(dp[currIndex][prevIndex + 1] != -1) {
            return dp[currIndex][prevIndex + 1];
        }
        int includingCurrent = 0;
        if(prevIndex == -1 || inArray[currIndex] > inArray[prevIndex]) {
            includingCurrent = 1 + findLISRecursive(inArray, currIndex + 1, currIndex, dp);
        }
        int excludingCurrent =  findLISRecursive(inArray, currIndex + 1, prevIndex, dp);
        return dp[currIndex][prevIndex + 1] = Math.max(includingCurrent, excludingCurrent);
    }
}
