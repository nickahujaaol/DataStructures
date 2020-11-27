package com.learning.ds.educative.dp.knapsack_1;

public class P6_CountNumberOfSubsetsWithGivenDifference {
    public static void main(String[] args) {
        int[] inSet = {1, 1, 2, 3};
        int difference = 1;
        int count = findDifference(inSet, difference, 0, 0, 0);
        System.out.println("Count is: " + count);
    }

    private static int findDifference(int[] inSet, int difference, int index, int sum1, int sum2) {
        if(index == inSet.length && Math.abs(sum1 - sum2) == difference) {
            return 1;
        }

        if(index >= inSet.length)
            return 0;

        int leftDiff = findDifference(inSet, difference, index + 1, sum1 + inSet[index], sum2);
        int rightDiff = findDifference(inSet, difference, index + 1, sum1, sum2 + inSet[index]);
        return leftDiff + rightDiff;
    }

}
