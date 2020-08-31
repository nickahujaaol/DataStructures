package com.learning.ds.educative.dp.archived.fibonacci;

public class NumFactors {
    public static void main(String[] args) {
        int number = 5;
        int numOfWays = getNumWaysRecursive(number);
        System.out.println("Num of Ways: " + numOfWays);
        numOfWays = getNumWaysBottomUp(number);
        System.out.println("Num of Ways: " + numOfWays);
    }

    private static int getNumWaysBottomUp(int number) {
        int[] dp = new int[number + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= number; i++) {
            dp[i] = dp[i - 1] + dp[i - 3] + dp[i - 4];
        }

        return dp[number];
    }

    // use 1,3,4
    private static int getNumWaysRecursive(int number) {
        if (number == 0)
            return 1;
        if (number == 1)
            return 1;
        if (number == 2)
            return 1;
        if (number == 3)
            return 2;

        int way1 = getNumWaysRecursive(number - 1);
        int way3 = getNumWaysRecursive(number - 3);
        int way4 = getNumWaysRecursive(number - 4);
        return way1 + way3 + way4;
    }
}
