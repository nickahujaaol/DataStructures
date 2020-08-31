package com.learning.ds.educative.dp.archived.fibonacci;

public class StairCase {
    public static void main(String[] args) {
        int numWays = getNumWaysRecursive(4);
        System.out.println("Num of ways: " + numWays);
        numWays = getNumWaysBottomUp(4);
        System.out.println("Num of ways: " + numWays);
    }

    private static int getNumWaysBottomUp(int numOfStairs) {
        int[] dp = new int[numOfStairs + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= numOfStairs; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[numOfStairs];
    }

    // one can climb 1,2 or 3 steps at a time.
    private static int getNumWaysRecursive(int numOfStairs) {
        if (numOfStairs == 0)
            return 1;
        if (numOfStairs == 1)
            return 1;
        if (numOfStairs == 2)
            return 2;

        int step1Ways = getNumWaysRecursive(numOfStairs - 1);
        int step2Ways = getNumWaysRecursive(numOfStairs - 2);
        int step3Ways = getNumWaysRecursive(numOfStairs - 3);

        return step1Ways + step2Ways + step3Ways;
    }
}
