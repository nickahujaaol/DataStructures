package com.learning.ds.educative.dp.archived.unbounded.knapsack;

public class MaximumRibbonCut {
    public static void main(String[] args) {
        int[] lengths = {2,3,5};
        int givenLength = 5;
        int maxNum = getMaxNumRecursive(lengths, givenLength, 0, 0);
        System.out.println("Max cuts are: " + maxNum);
        maxNum = getMaxNumBottomUp(lengths, givenLength);
        System.out.println("Max cuts are: " + maxNum);
    }

    private static int getMaxNumBottomUp(int[] lengths, int givenLength) {
        int[][] dp = new int[lengths.length + 1][givenLength + 1];

        for(int i=0; i < lengths.length; i++)
            for(int j=0; j <= givenLength; j++)
                dp[i][j] = Integer.MIN_VALUE;

        // populate the total=0 columns, as we don't need any coin to make zero total
        for(int i=0; i < lengths.length; i++)
            dp[i][0] = 0;

        for(int row = 1; row <= lengths.length; row++) {
            for (int col = 1; col <= givenLength; col++) {
                if (col < lengths[row - 1]) {
                    dp[row][col] = dp[row - 1][col];
                } else {
                    int lengthIncluding = 1 + dp[row][col - lengths[row - 1]];
                    int lengthExcluding = dp[row - 1][col];
                    dp[row][col] = Math.max(lengthIncluding, lengthExcluding);
                }
            }
        }

        return dp[lengths.length][givenLength];
    }

    private static int getMaxNumRecursive(int[] lengths, int givenLength, int index, int currLength) {
        if(currLength == givenLength)
            return 0;

        if(index >= lengths.length)
            return Integer.MIN_VALUE;

        if(lengths[index] + currLength <= givenLength) {
            int leftSum = Integer.MIN_VALUE;
            int leftTemp = getMaxNumRecursive(lengths, givenLength, index, currLength + lengths[index]);
            if(leftTemp != Integer.MIN_VALUE) {
                leftSum = leftTemp + 1;
            }

            int rightSum = getMaxNumRecursive(lengths, givenLength, index + 1, currLength);
            return Math.max(leftSum, rightSum);
        } else {
            return getMaxNumRecursive(lengths, givenLength, index + 1, currLength);
        }
    }
}
