package com.learning.ds.educative.patterns.slidingwindow_1;

public class P1_MaxSumSubArray {
    public static void main(String[] args) {
        int inNums[] = {2,1,5,1,3,2};
        int maxSum = getSum(inNums, 3);
        System.out.println("Max sum is: " + maxSum);

    }

    private static int getSum(int[] inNums, int size) {
        int maxSum = Integer.MIN_VALUE;
        int workingSum = 0;
        int index = 1;
        for(int i = 0; i < inNums.length; i++, index++) {
            workingSum += inNums[i];
            if(index >= size) {
                maxSum = Math.max(maxSum, workingSum);
                workingSum -= inNums[i - size + 1];
            }
        }
        return maxSum;
    }
}
