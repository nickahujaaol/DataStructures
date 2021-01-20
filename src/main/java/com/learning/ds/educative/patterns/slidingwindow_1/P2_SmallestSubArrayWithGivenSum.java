package com.learning.ds.educative.patterns.slidingwindow_1;

public class P2_SmallestSubArrayWithGivenSum {
    public static void main(String[] args) {
        int[] inNums = {2,1,5,2,3,2};
        int sum = 7;
        int size = getSmallest(inNums, sum);
        System.out.println("Smallest Size is: " + size);
    }

    private static int getSmallest(int[] inNums, int targetSum) {
        int minLength = Integer.MAX_VALUE;
        int workingSum = 0;

        int workingLength = 0;
        int windowStart = 0;
        for(int i = 0; i < inNums.length; i++) {
            workingSum += inNums[i];
            workingLength++;
            while (workingSum >= targetSum) {
                minLength = Math.min(minLength, workingLength);
                workingSum -= inNums[windowStart++];
                workingLength--;
            }
        }

        return minLength;
    }
}
