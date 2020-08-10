package com.learning.ds.educative.dp.archived.fibonacci;

import java.util.Arrays;

public class MinJumpsWithFee {
    public static void main(String[] args) {
        int[] fee = {1,2,5,2,1,2};
        int minCost = getMinRecursive(fee, 0);
        System.out.println("Min Fee is: " + minCost);

        minCost = getMinBottomUp(fee);
        System.out.println("Min Fee is: " + minCost);
    }

    private static int getMinBottomUp(int fee[]) {
        int[] dp = new int[fee.length + 1];
        dp[0] = 0;
        dp[1] = fee[0];
        dp[2] = dp[3] = fee[0];

        for(int i = 4; i <= fee.length; i++) {
            int jump3Fee = dp[i - 3] + fee[i - 3];
            int jump2Fee = dp[i - 2] + fee[i - 2];
            int jump1Fee = dp[i - 1] + fee[i - 1];
            dp[i] = Math.min(jump1Fee, Math.min(jump2Fee, jump3Fee));
        }

        return dp[fee.length];
    }

    private static int getMinRecursive(int[] fee, int index) {
        if(index >= fee.length)
            return 0;

        int step1 = getMinRecursive(fee, index + 1);
        int step2 = getMinRecursive(fee, index + 2);
        int step3 = getMinRecursive(fee, index + 3);

        return fee[index] + Math.min(step1, Math.min(step2, step3));
    }
}
