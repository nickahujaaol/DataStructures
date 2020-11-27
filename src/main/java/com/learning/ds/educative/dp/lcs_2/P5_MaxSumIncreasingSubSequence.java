package com.learning.ds.educative.dp.lcs_2;

public class P5_MaxSumIncreasingSubSequence {
    public static void main(String[] args) {
        int[] inArray = {4, 1, 2, 6, 10, 1, 12};
        int maxSeq = findLISRecursive(inArray, 0, -1);
        System.out.println("Max LIS Sum is: " + maxSeq);
    }

    private static int findLISRecursive(int[] inArray, int currIndex, int prevIndex) {
        if(currIndex >= inArray.length)
            return 0;

        if(prevIndex == -1 || inArray[currIndex] > inArray[prevIndex]) {
            int includingCurrent = inArray[currIndex] + findLISRecursive(inArray, currIndex + 1, currIndex);
            int excludingCurrent = findLISRecursive(inArray, currIndex + 1, prevIndex);
            return Math.max(includingCurrent, excludingCurrent);
        } else {
            return findLISRecursive(inArray, currIndex + 1, prevIndex);
        }
    }

}
