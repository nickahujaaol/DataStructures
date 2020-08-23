package com.learning.ds.educative.dp.knapsack;

public class SubsetSum {
    public static void main(String[] args) {
        int[] set = {1, 2, 7, 1, 5};
        int sum = 10;

        boolean exists = isSubsetPresent(set, sum, set.length - 1);
        System.out.println("Partition Exists: " + exists);
    }

    private static boolean isSubsetPresent(int[] set, int sum, int index) {
        if(sum == 0 && index == 0)
            return true;

        if(index < 0)
            return false;

        if(set[index] <= sum) {
            boolean leftExists = isSubsetPresent(set, sum - set[index], index - 1);
            boolean rightExists = isSubsetPresent(set, sum, index - 1);
            return leftExists || rightExists;
        } else {
            return isSubsetPresent(set, sum, index - 1);
        }
    }
}
