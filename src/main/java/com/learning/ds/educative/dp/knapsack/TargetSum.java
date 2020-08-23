package com.learning.ds.educative.dp.knapsack;

public class TargetSum {
    public static void main(String[] args) {
        int[] set = {1, 1, 2, 3};
        int sum = 1;
        int numOfWays = getNumOfWays(set, sum, 0, set.length - 1);
        System.out.println("Num of Ways: " + numOfWays);
    }

    private static int getNumOfWays(int[] set, int targetSum, int sum, int index) {
        if(sum == targetSum && index < 0)
            return 1;

        if(index < 0)
            return 0;

        int plusWays = getNumOfWays(set, targetSum, sum + set[index], index - 1);
        int minusWays = getNumOfWays(set, targetSum, sum + set[index] * -1, index - 1);
        return plusWays + minusWays;
    }
}
