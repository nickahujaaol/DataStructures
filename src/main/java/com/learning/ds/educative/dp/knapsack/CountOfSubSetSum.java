package com.learning.ds.educative.dp.knapsack;

public class CountOfSubSetSum {
    public static void main(String[] args) {
        int[] set = {1, 1, 2, 3};
        int sum = 4;
        int count = getCount(set, sum, set.length - 1);
        System.out.println("Count is: " + count);
    }

    private static int getCount(int[] set, int sum, int index) {
        if(sum == 0 && index < 0)
            return 1;

        if(index < 0)
            return 0;

        if(set[index] <= sum) {
            int leftCount = getCount(set, sum - set[index], index - 1);
            int rightCount = getCount(set, sum, index - 1);
            return leftCount + rightCount;
        } else {
            return getCount(set, sum, index - 1);
        }

    }
}
